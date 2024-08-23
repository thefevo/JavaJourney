package chapter3;

import java.util.Scanner;

public class Driverclassaccounttest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create an account object and assign it to myaccount

        Account myAccount = new Account();

        //display the initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getname());

        //prompt and read name
        System.out.println("Enter your name");
        String thename = input.nextLine();
        myAccount.setname(thename);
        System.out.println();

        System.out.printf("Your name is:n%s%n");
        myAccount.getname();
    }
}
