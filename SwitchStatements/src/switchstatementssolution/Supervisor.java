/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatementssolution;

/**
 *
 * @author Steffany
 */
public class Supervisor extends EmployeeFinal {
   
    public Supervisor(float salary, float bonusPercentage){
        
       super(salary, bonusPercentage);
    }

    @Override
     public float CalculateSalary() {    
        return salary + (bonusPercentage * 0.5F);    
     }
}



