import java.util.ArrayList;
import java.util.Scanner;

public class BankManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        System.out.print("Enter Savings Account Number: ");
        String saNo = sc.nextLine();

        System.out.print("Enter Savings Account Holder Name: ");
        String saName = sc.nextLine();

        System.out.print("Enter Interest Rate: ");
        double rate = sc.nextDouble();

        BankAccount sa = new SavingsAccount(saNo, saName, rate);

        System.out.print("Enter Checking Account Number: ");
        sc.nextLine();
        String caNo = sc.nextLine();

        System.out.print("Enter Checking Account Holder Name: ");
        String caName = sc.nextLine();

        System.out.print("Enter Overdraft Limit: ");
        double limit = sc.nextDouble();

        BankAccount ca = new CheckingAccount(caNo, caName, limit);

        accounts.add(sa);
        accounts.add(ca);

        System.out.print("Enter amount to deposit in Savings: ");
        double dep = sc.nextDouble();
        sa.deposit(dep);

        System.out.print("Enter amount to withdraw from Checking: ");
        double wd = sc.nextDouble();
        ca.withdraw(wd);

        if (sa instanceof SavingsAccount) {
            ((SavingsAccount) sa).applyInterest();
        }

        System.out.println("\nAccount Details:");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountDetails());
        }

        sc.close();
    }
}
