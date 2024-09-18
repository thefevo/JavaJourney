package chapter4;

import java.util.Scanner;

public class salescommisioncalculator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        final double salary = 200.0;
        final double commisionrate = 0.09;
        //int i=1;

        double grosssale = 0.00;

        System.out.print("Enter the number of items sold");
        int numberofitems = input.nextInt();

        for (int i = 1; i <= numberofitems; i++) {
            System.out.print("Enter the value of item %d:");
            double itemvalue=input.nextDouble();
            grosssale += itemvalue;

            double earnings = salary + (commisionrate * grosssale);

            System.out.printf("Total earnings for the week: $%.2f%n", earnings);

            System.out.println("that's all for this section!");

        }
    }
}
