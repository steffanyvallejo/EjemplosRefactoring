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
public class Employee {

    private float salary;
    private float bonusPercentage;
    private String tipo;

    public Employee(float salary, float bonusPercentage, String type) {
        this.salary = salary;
        this.bonusPercentage = bonusPercentage;
        this.tipo = type;
    }

    public float CalculateSalary() {
        switch (tipo) {
            case "Worker":
                return salary;
            case "Supervisor":
                return salary + (bonusPercentage * 0.5F);
            case "Manager":
                return salary + (bonusPercentage * 0.7F);
            default:
                return 0.0F;
        }

    }

    public float CalculateBonusYear() {
        switch (tipo) {
            case "Worker":
                return 0;
            case "Supervisor":
                return salary + salary * 0.7F;
            case "Manager":
                return salary + salary * 1.0F;
            default:
                return 0.0F;
        }

    }
}
