/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatementssolution;

import switchstatements.*;

/**
 *
 * @author Steffany
 *
 */
public class SwitchStatementsSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeFinal e1= new Worker(800, 5);
        System.out.println("Empleado1, Salario: "+e1.CalculateSalary());
        EmployeeFinal e2= new Manager(1000,10);
        System.out.println("Empleado2, Salario: "+e2.CalculateSalary());
    }
    
}
