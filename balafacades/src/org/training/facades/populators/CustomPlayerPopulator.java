package org.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import org.training.core.model.PlayerModel;
import org.training.facades.product.data.PlayerData;

public class CustomPlayerPopulator implements Populator<ProductModel, ProductData> {

    Converter<PlayerModel, PlayerData> playerDataConverter;


    @Override
    public void populate(ProductModel source, ProductData target) throws ConversionException {
        target.setPlayers(getPlayerDataConverter().convertAll(source.getPlayers()));
    }

    public Converter<PlayerModel, PlayerData> getPlayerDataConverter() {
        return playerDataConverter;
    }

    public void setPlayerDataConverter(Converter<PlayerModel, PlayerData> playerDataConverter) {
        this.playerDataConverter = playerDataConverter;
    }
}
