package chapter2;

import java.util.Scanner;

public class IntegerAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer");
        int num2 = input.nextInt();

        System.out.print("Enter the third iinteger");
        int num3 = input.nextInt();
        //calculate the sum of three integers

        int sum = num1 + num2 + num3;

        int average = sum/3;

        int product = num1 * num2 * num3;

        int smallest = Math.min(num1, Math.min(num2,num3));

        int largest = Math.max(num1,Math.max(num2,num3));

        System.out.printf("sum: %d%n",sum);
        System.out.printf("average: %d%n",average);
        System.out.printf("product: %d%n",product);
        System.out.printf("smallest: %d%n",smallest);
        System.out.printf("largest: %d%n",largest);
    }
}