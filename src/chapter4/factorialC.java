package chapter4;

import java.util.Scanner;

public class factorialC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();

        System.out.print("Enter the number of terms to estimate e^x: ");
        int terms = input.nextInt();

        double result = 1.0;
        double factorial = 1.0;
        double powerOfX = 1.0;

        for (int i = 1; i < terms; i++) {
            factorial *= i;
            powerOfX *= x;
            result += powerOfX / factorial;
        }

        System.out.printf("Estimated value of e^%.2f using %d terms is: %.10f%n", x, terms, result);

        input.close();
    }
}


