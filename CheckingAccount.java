public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName, double overdraftLimit) {
        super(accountNumber, accountHolderName);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Overdraft limit exceeded or invalid amount");
        }
    }

    @Override
    public String getAccountDetails() {
        return "Checking Account #" + getAccountNumber() +
                ", Balance: $" + getBalance() +
                ", Limit: $" + overdraftLimit;
    }
}
