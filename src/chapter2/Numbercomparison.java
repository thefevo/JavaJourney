package chapter2;

import java.util.Scanner;

public class Numbercomparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer");
        int number = input.nextInt();

        int square = number * number;

        //compare number to 100

        if (number > 100) {
            System.out.printf("%d is greater than 100%n", number);

        }else if (number == 100) {
            System.out.printf("%d is equal to 100%n", number);
        }else {
            System.out.printf("%d is less than 100%n", number);


        }

        //compare the square of the number to 100
        if (square > 100) {
            System.out.printf("The square of %d is %d and is greater than 100%n", number, square);
        } else if (square == 100) {
            System.out.printf("The square of %d is %d and is equal to 100%n", number, square);
        } else {
            System.out.printf("The square of %d is %d and is less than 100%n", number, square);
        }

        if (number != 100) {
            System.out.printf("%d is not equal to 100%n", number);
        }

        if (square != 100) {
            System.out.printf("the square of %d is %d and not equals to 100%n", number,square);
        }
        }
    }
