import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main1 {
    public static void main(String[] args) {
//        Account account = new Account(1001, "John", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Mary", 0.0, 500.0);

        // UP CASTING
        Account acc1 = businessAccount;
        Account acc2 = new BusinessAccount(1003, "Jeff", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Lay", 0.0, 0.01);

        // DOWN CASTING
        BusinessAccount businessAccount1 = (BusinessAccount) acc2;
        businessAccount1.loan(100.0);

        // BusinessAccount businessAccount3 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount businessAccount3 = (BusinessAccount) acc3;
            businessAccount3.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount savingsAccount = (SavingsAccount) acc3;
            savingsAccount.updateBalance();
            System.out.println("Update!");
        }
    }
}