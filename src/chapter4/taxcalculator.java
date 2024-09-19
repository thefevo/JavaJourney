package chapter4;

import java.util.Scanner;

public class taxcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double taxRate = 0.15;
        final double excessTaxRate = 0.20;
        final double ceiling = 30000;

        String name, name1, name2;
        double nameEarnings, nameEarnings1, nameEarnings2;


        System.out.printf("Enter the name of user one: ");
        name = input.nextLine();

        System.out.print("Enter the earnings of user 1: ");
        nameEarnings = input.nextDouble();
        input.nextLine();

        double totalTax;
        if (nameEarnings <= ceiling) {
            totalTax = nameEarnings * taxRate;
        } else {
            double excess = nameEarnings - ceiling;
            totalTax = (ceiling * taxRate) + (excess * excessTaxRate);
        }
        System.out.printf("%s earned $%.2f and owes $%.2f in taxes.%n", name, nameEarnings, totalTax);


        System.out.printf("Enter the name of user two: ");
        name1 = input.nextLine();

        System.out.print("Enter the earnings of user 2: ");
        nameEarnings1 = input.nextDouble();
        input.nextLine();

        if (nameEarnings1 <= ceiling) {
            totalTax = nameEarnings1 * taxRate;
        } else {
            double excess = nameEarnings1 - ceiling;
            totalTax = (ceiling * taxRate) + (excess * excessTaxRate);
        }
        System.out.printf("%s earned $%.2f and owes $%.2f in taxes.%n", name1, nameEarnings1, totalTax);


        System.out.printf("Enter the name of user three: ");
        name2 = input.nextLine();

        System.out.print("Enter the earnings of user 3: ");
        nameEarnings2 = input.nextDouble();
        input.nextLine();

        if (nameEarnings2 <= ceiling) {
            totalTax = nameEarnings2 * taxRate;
        } else {
            double excess = nameEarnings2 - ceiling;
            totalTax = (ceiling * taxRate) + (excess * excessTaxRate);
        }
        System.out.printf("%s earned $%.2f and owes $%.2f in taxes.%n", name2, nameEarnings2, totalTax);
    }
}
