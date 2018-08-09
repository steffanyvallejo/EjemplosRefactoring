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
public class Employee {

    private float salary;
    private IRetributionCalculator retributionCalculator;

    /**
     *
     * @param salary
     * @param retributionCalculator
     */
    public Employee(float salary, IRetributionCalculator retributionCalculator) {
        this.salary = salary;
        this.retributionCalculator = retributionCalculator;
    }

    public float CalculateSalary() {
        return retributionCalculator.CalculateSalary(salary);
    }

    public float CalculateYearBonus() {
        return retributionCalculator.CalculateYearBonus(salary);
    }
}
