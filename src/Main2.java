import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main2 {
    public static void main(String[] args) {
        Account acc1 = new Account(1001, "David", 1000.0);
        acc1.withdraw(200.0);

        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Silva", 1000.0, 0.01);
        acc2.withdraw(200.0);

        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "DS", 1000.0, 500.0);
        acc3.withdraw(200.0);

        System.out.println(acc3.getBalance());
    }
}