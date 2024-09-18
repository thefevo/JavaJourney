package chapter2;

import java.util.Scanner;

public class seperatingdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("enter any five digit number");

        //int = input.nextInt();
        //int number = input.nextInt();
        int number1 = (12345 / 10000);
        int number2 = (12345 / 1000 % 10);
        int number3 = (12345 / 100 % 10);
        int number4 = (12345 / 10 % 10);
        int number5 = (12345  % 10);

        System.out.printf("%d %d %d %d %d", number1,number2, number3, number4,number5);

    }
}
