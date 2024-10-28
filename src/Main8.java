import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of taxpayers: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = scanner.next().charAt(0);

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Annual income: ");
            Double annualIncome = scanner.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = scanner.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = scanner.nextInt();
                list.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("Taxes:");

        for (TaxPayer payer : list) {
            System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
        }

        System.out.println();
        double sum = 0.0;
        for (TaxPayer payer : list) {
            sum += payer.tax();
        }

        System.out.println("Total Taxes: $" + String.format("%.2f", sum));

        scanner.close();
    }
}

