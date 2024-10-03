import entities.Account;
import entities.SavingsAccount;

public class Main4 {
    public static void main(String[] args) {

        Account x = new Account(1020, "John", 1000.0);
        Account y = new SavingsAccount(1020, "John", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
