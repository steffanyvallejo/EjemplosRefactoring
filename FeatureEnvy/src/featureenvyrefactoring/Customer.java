/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package featureenvyrefactoring;

import featureenvy.*;

/**
 *
 * @author Steffany Vallejo
 * Aplicacion de la tecnica de refactorizacion: 
 */
public class Customer {

    private Phone mobilePhone;

    public String getMobilePhoneNumber() {
        return mobilePhone.toFormattedString();
    }
}
