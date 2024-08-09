package chapter2;

import java.util.Scanner;

public class codesnippet4 {
    public static void main(String[] args) {
//create a scanner object to read from the user

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer");
        int firstnumber = input.nextInt();

        System.out.print("Enter the second integer");
        int secondnumber = input.nextInt();

        int firstsquare = firstnumber * firstnumber;
        int secondsquare = secondnumber * secondnumber;

        int sumofsquare = firstsquare + secondsquare;

        int differenceofsquare = firstsquare - secondsquare;

        System.out.printf("the square of %d is %d%n", firstsquare,firstsquare);
        System.out.printf("the square of %d is %d%n", secondsquare,secondsquare);
        System.out.printf("the sum of their squares is  %d%n", secondsquare,secondsquare);
        System.out.printf("the difference of their squares is  %d%n", secondsquare,secondsquare);

    }
}
