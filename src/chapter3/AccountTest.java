package chapter3;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create an account object and assign it to myaccount

        Account myAccount = new Account();

        //display the initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        //prompt and read name
        System.out.println("Enter your name");
        String thename = input.nextLine();
        myAccount.setName(thename);
        System.out.println();

        System.out.printf("Your name is: %s%n%n",myAccount.getName());
        myAccount.getName();
    }
}
