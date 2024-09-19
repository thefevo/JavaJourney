package chapter4;

import java.util.Scanner;

public class findthelargestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=1;
        int number;
        int largest=Integer.MIN_VALUE;

        while (counter<=10) {
            System.out.printf("Enter number:%d", counter);
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }
            counter++;
        }

        System.out.printf("The largest number is: %d%n",largest);
    }
}
