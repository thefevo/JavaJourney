package chapter4;

import java.util.Scanner;

public class creditlimitcalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int accountnumber;
        int balanceforfirstofthemonth;
        int totalchargedforthismonth;
        int totalcreditforthecustomerthismonth;
        int allowedcreditlimit;
        int newbalance;

        while (true) {
            System.out.print("Enter account number");
            accountnumber = input.nextInt();

            if (accountnumber == 1) {

            }

            System.out.print("Enter balance for this month:");
            balanceforfirstofthemonth = input.nextInt();

            System.out.print("Enter the total charged for this month:");
            totalchargedforthismonth = input.nextInt();

            System.out.print("Enter the total of credit applied to the customer this month:");
            totalcreditforthecustomerthismonth = input.nextInt();

            System.out.print("Enter the credit limit:");
            allowedcreditlimit = input.nextInt();

            newbalance = balanceforfirstofthemonth + totalchargedforthismonth - totalchargedforthismonth;

            System.out.printf("new balance %d%n", newbalance);

            if (newbalance > allowedcreditlimit) ;

            System.out.print("crediit limit exceeded!");

            System.out.println(" ");

            System.out.print("thank you for your time!");

        }
    }
}

