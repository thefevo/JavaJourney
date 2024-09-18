package chapter2;

import java.util.Scanner; // program uses class Scanner
import javax.swing.JOptionPane;

public class Addition1 {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer");//prompt
        int number1 = input.nextInt(); // read second number from use

        System.out.print("Enter second integer");
        int number2 = input.nextInt();

        int sum = number1 + number2;

        System.out.printf("sum is %d%n", sum);// display sum

    }// end method main
}// end class Addition
