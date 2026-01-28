public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double interestRate) {
        super(accountNumber, accountHolderName);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
    }

    @Override
    public String getAccountDetails() {
        return "Savings Account #" + getAccountNumber() +
                ", Balance: $" + getBalance() +
                ", Rate: " + (interestRate * 100) + "%";
    }
}
