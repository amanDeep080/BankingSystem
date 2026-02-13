package assignment6_employees;

public class ContractEmployee implements Payable {
    private final double hourlyRate;
    private final double hoursWorked;

    public ContractEmployee(double hourlyRate, double hoursWorked) {
        if (hourlyRate < 0 || hoursWorked < 0) {
            throw new IllegalArgumentException("Hourly rate and hours worked cannot be negative.");
        }
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
