/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatements;

/**
 *
 * @author Steffany
 */
public class SwitchStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1= new Employee(800,5,"Worker");
        System.out.println("Empleado1, Salario: "+e1.CalculateSalary());
        Employee e2= new Employee(1000,10,"Manager");
        System.out.println("Empleado2, Salario: "+e2.CalculateSalary());
    }
    
}
