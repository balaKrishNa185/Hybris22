package org.training.storefront.controllers.command.validation;

import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.RegistrationValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.training.storefront.controllers.command.CustomRegisterForm;

@Component("customRegistrationFormValidator")
public class CustomRegistrationFormValidator extends RegistrationValidator {


    @Override
    public boolean supports(Class<?> aClass) {
        return super.supports(aClass);
    }


    @Override
    public void validate(Object object, Errors errors) {
        super.validate(object, errors);
        CustomRegisterForm customRegisterForm= (CustomRegisterForm) object;
        String place=customRegisterForm.getPlace();
        boolean newBusinessUser= customRegisterForm.isNewBusinessUser();

        validateNewBusinessUser(errors,newBusinessUser);

        if(place==null)
        {
            errors.rejectValue("place","place.notValid");
        }
    }

    private void validateNewBusinessUser(Errors errors, boolean newBusinessUser) {

        if(!newBusinessUser)
        {
            errors.rejectValue("newBusinessUser","not.a.newBusinessUser");
        }
    }
}
