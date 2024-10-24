package chapter5;

import java.util.Scanner;

public class iintegersdivisibleby3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        // Loop through numbers from 1 to 30
        for (int i = 1; i <= 30; i++) {
            // Check if the number is divisible by 3
            if (i % 3 == 0) {
               sum += i; // Add to sum if divisible by 3
           // }
        //}

        // Display the calculated sum
        //System.out.println("The sum of integers between 1 and 30 that are divisible by 3 is: " + sum);

       // input.close();
    }
}

