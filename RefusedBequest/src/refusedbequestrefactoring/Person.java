/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refusedbequestrefactoring;

import refusedbequest.*;

/**
 *
 * @author Steffany
 */
public class Person{
     Tax taxes;
    

  public double GetTaxAmount() {  
        double tax = taxes.CalculateBaseTax();  
        double taxAmount =  taxes.AddTax(tax);  
        return taxAmount;  
    }  
}
