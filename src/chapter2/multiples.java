package chapter2;

import java.util.Scanner;

public class multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

System.out.println("Enter your first integer");
        int number1 = input.nextInt();

        System.out.println("Enter your second integer");
        int number2 = input.nextInt();

       int a = (number1 * 3);
       int b = (number2 * 2);

       if (a % b ==0) {
           System.out.print("when number one is tripled is a multiple of the second number doubled");
       }

       else{
           System.out.print("when not tripled is not a multiple of  the second number");
       }
    }
}
