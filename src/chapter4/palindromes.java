package chapter4;

import java.util.Scanner;

public class palindromes {
    public palindromes() {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;


        do {
            System.out.print("Enter a five-digit integer: ");
            number = input.nextInt();


            if (number < 10000 || number > 99999) {
                System.out.println("Error: The number must be a five-digit integer.");
            }
        } while (number < 10000 || number > 99999);


        if (isPalindrome(number)) {
            System.out.printf("%d is a palindrome.%n", number);
        } else {
            System.out.printf("%d is not a palindrome.%n", number);
        }

        input.close();
    }


    public static boolean isPalindrome(int number) {

        int firstDigit = number / 10000;
        int secondDigit = (number / 1000) % 10;
        int fourthDigit = (number / 10) % 10;
        int fifthDigit = number % 10;


        return (firstDigit == fifthDigit) && (secondDigit == fourthDigit);
    }
}
