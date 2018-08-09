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
public abstract class EmployeeFinal {

    protected float bonusPercentage;
    protected float salary;

    public EmployeeFinal(float salary, float bonusPercentage) {
        this.salary = salary;
        this.bonusPercentage = bonusPercentage;
    }

    abstract public float CalculateSalary();

    public float CalculateYearBonus() {
        return 0.0F;
    }

}
