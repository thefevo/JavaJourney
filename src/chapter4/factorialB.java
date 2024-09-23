package chapter4;

import java.util.Scanner;

public class factorialB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms to estimate e: ");
        int terms=input.nextInt();

        double e = 1.0;
        double factorial = 1.0;

        for (int i = 1; i < terms; i++) {
            factorial *= i;
            e += 1.0 / factorial;
        }

        System.out.printf("Estimated value of e using %d terms is: %.10f%n", terms, e);

        input.close();
    }
}


