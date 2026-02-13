package assignment6_employees;

public class SalariedEmployee implements Payable {
    private final double annualSalary;

    public SalariedEmployee(double annualSalary) {
        if (annualSalary < 0) {
            throw new IllegalArgumentException("Annual salary cannot be negative.");
        }
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double calculatePay() {
        return annualSalary / 12.0; // monthly pay
    }
}
