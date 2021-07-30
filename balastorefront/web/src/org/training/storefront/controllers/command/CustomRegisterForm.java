package org.training.storefront.controllers.command;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;

public class CustomRegisterForm extends RegisterForm {

    private String place;
    private boolean newBusinessUser;


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public boolean isNewBusinessUser() {
        return newBusinessUser;
    }

    public void setNewBusinessUser(boolean newBusinessUser) {
        this.newBusinessUser = newBusinessUser;
    }
}
