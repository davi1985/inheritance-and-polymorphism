import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1, "Dave", 500.0, 0.01));
        list.add(new BusinessAccount(2, "Joseph", 500.0, 0.01));
        list.add(new SavingsAccount(3, "Steve", 300.0, 0.01));
        list.add(new BusinessAccount(3, "Anne", 500.0, 500.0));

//        double sum = 0.0;
//        for (Account acc : list) {
//            sum += acc.getBalance();
//        }

        double sum = list.stream().map(Account::getBalance).reduce(0.0, Double::sum);
        System.out.println(sum);

        for (Account acc : list) {
            acc.deposit(10);
        }

        list.forEach(account -> System.out.println(account.getBalance()));
    }
}