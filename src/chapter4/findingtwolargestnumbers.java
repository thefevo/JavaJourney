package chapter4;

import java.util.Scanner;

public class findingtwolargestnumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (counter = 1; counter <= 10; counter++) {
            System.out.print("Enter number " + counter + ": ");
            number = input.nextInt();

            if (number > largest) {
                // Update second largest before changing largest
                secondLargest = largest;
                largest = number;
            }
        }
        System.out.printf("The largest number is: %d%n", largest);
        System.out.printf("The largest number is: %d%n", secondLargest);


    }
}
