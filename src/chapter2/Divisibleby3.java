package chapter2;

import java.util.Scanner;

public class Divisibleby3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any integer of your choice: ");
        int number = input.nextInt();


        /*if (number % 3 == 0) {
            System.out.println(number + "is divisible by 3");
        }

        if (number % 3 != 0) {
            System.out.println(number + "is not divisible by 3");
        }*/
        if (number % 3 == 0) {
            System.out.printf("%d is divisible by 3!", number);
        }
        if (number % 3 != 0) {
            System.out.printf("%d is not divisible by 3!", number);
        }

        }
    }

