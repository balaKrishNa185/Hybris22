package org.training.core.customQualifierProvider;

import de.hybris.platform.core.model.c2l.CurrencyModel;
import de.hybris.platform.core.model.user.UserGroupModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.europe1.enums.UserPriceGroup;
import de.hybris.platform.servicelayer.i18n.CommonI18NService;
import de.hybris.platform.servicelayer.session.SessionService;
import de.hybris.platform.solrfacetsearch.config.FacetSearchConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.IndexedType;
import de.hybris.platform.solrfacetsearch.provider.Qualifier;
import de.hybris.platform.solrfacetsearch.provider.QualifierProvider;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;

import java.util.*;




public class CustomPriceQualifierProvider implements QualifierProvider {


    private CommonI18NService commonI18NService;
    private Set<Class<?>> supportedTypes;
    private SessionService sessionService;
    private final Logger LOG=Logger.getLogger(CustomPriceQualifierProvider.class);

    public CustomPriceQualifierProvider() {
        Set<Class<?>> types = new HashSet<>();
        types.add(CurrencyModel.class);
        types.add(UserGroupModel.class);
        supportedTypes = Collections.unmodifiableSet(types);
    }

    @Override
    public Set<Class<?>> getSupportedTypes() {
        return this.supportedTypes;
    }

    public CommonI18NService getCommonI18NService() {
        return commonI18NService;
    }

    @Required
    public void setCommonI18NService(CommonI18NService commonI18NService) {
        this.commonI18NService = commonI18NService;
    }
    public SessionService getSessionService() {
        return sessionService;
    }
    @Required
    public void setSessionService(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @Override
    public Collection<Qualifier> getAvailableQualifiers(FacetSearchConfig facetSearchConfig, IndexedType indexedType) {
        LOG.info("CustomPriceQualifierProvider.......getAvailableQualifiers() is called");
        Objects.requireNonNull(facetSearchConfig, "facetSearchConfig is null");
        Objects.requireNonNull(indexedType, "indexedType is null");
        List<Qualifier> qualifiers = new ArrayList();

        Iterator var1 = facetSearchConfig.getIndexConfig().getCurrencies().iterator();
        List<UserGroupModel> userGroups=facetSearchConfig.getIndexConfig().getCustomUserGroup();

        while (var1.hasNext()) {
            CurrencyModel currency = (CurrencyModel) var1.next();
            if(userGroups != null) {
                UserPriceGroup userPriceGroup=null;
                for(UserGroupModel userGroup:userGroups)
                {
                    userPriceGroup= userGroup.getUserPriceGroup();
                    LOG.info("CustomPriceQualifierProvider.......userPriceGroup values are iterated from UserGroups");
                }
                Qualifier qualifier = new CustomPriceQualifier(currency, userPriceGroup);
                qualifiers.add(qualifier);
                LOG.info("CustomPriceQualifierProvider.......currency, userPriceGroup Qualifiers are added");
            } else {
                Qualifier qualifier = new CustomPriceQualifier(currency);
                qualifiers.add(qualifier);
                LOG.info("CustomPriceQualifierProvider.......currency Qualifiers are added");
            }
        }
        return Collections.unmodifiableList(qualifiers);
    }

    @Override
    public boolean canApply(IndexedProperty indexedProperty) {
        Objects.requireNonNull(indexedProperty, "indexedProperty is null");
        return true;
    }

    @Override
    public void applyQualifier(Qualifier qualifier) {
        Objects.requireNonNull(qualifier, "qualifier is null");
        if (!(qualifier instanceof CustomPriceQualifier)) {
            throw new IllegalArgumentException("provided qualifier is not of expected type");
        } else {
            LOG.info("CustomPriceQualifierProvider.......applyQualifier() is called");
            UserPriceGroup userPriceGroup= ((CustomPriceQualifier)qualifier).getUserPriceGroup();
            if(userPriceGroup!=null) {
                this.commonI18NService.setCurrentCurrency(((CustomPriceQualifier) qualifier).getCurrency());
                this.sessionService.setAttribute(UserModel.EUROPE1PRICEFACTORY_UPG, userPriceGroup);
            }else {
                this.commonI18NService.setCurrentCurrency(((CustomPriceQualifier) qualifier).getCurrency());
            }
        }
    }

    @Override
    public Qualifier getCurrentQualifier() {
        CurrencyModel currency = this.commonI18NService.getCurrentCurrency();
        UserPriceGroup userPriceGroup= this.sessionService.getAttribute(UserModel.EUROPE1PRICEFACTORY_UPG);
        if (userPriceGroup == null) {
            return new CustomPriceQualifier(currency);
        } else {
            return new CustomPriceQualifier(currency,userPriceGroup);
        }
    }


    protected static class CustomPriceQualifier implements Qualifier {
        private CurrencyModel currency;
        private UserPriceGroup userPriceGroup;

        public CustomPriceQualifier(CurrencyModel currency, UserPriceGroup userPriceGroup) {
            Objects.requireNonNull(currency, "currency is null");
            Objects.requireNonNull(userPriceGroup, "userPriceGroup is null");
            this.currency = currency;
            this.userPriceGroup = userPriceGroup;
        }

        public CustomPriceQualifier(CurrencyModel currency) {
            Objects.requireNonNull(currency, "currency is null");
            this.currency = currency;
        }


        public CurrencyModel getCurrency() {
            return currency;
        }

        public UserPriceGroup getUserPriceGroup() {
            return userPriceGroup;
        }


        public <U> U getValueForType(Class<U> type) {
            Objects.requireNonNull(type, "type is null");
            if(Objects.equals(type, CurrencyModel.class)) {
                return (U) this.currency;
            } else if (Objects.equals(type, UserPriceGroup.class)) {
                return (U)this.userPriceGroup;
            } else {
                throw new IllegalArgumentException("type not supported");
            }
        }

        @Override
        public String toFieldQualifier() {
            if(userPriceGroup!=null)
                return this.currency.getIsocode()+"_"+userPriceGroup.getCode();
            else
                return this.currency.getIsocode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            } else if (obj != null && this.getClass() == obj.getClass()) {
                CustomPriceQualifier that = (CustomPriceQualifier) obj;
                return (new EqualsBuilder()).append(this.currency, that.currency).append(this.userPriceGroup, that.userPriceGroup).isEquals();
            } else {
                return false;
            }
        }

    }
}
