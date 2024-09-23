package chapter4;

import java.util.Scanner;

public class enforcingpolicywwithcryptography1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.print("Enter a four-digit integer to encrypt: ");
        int number = input.nextInt();

        int digit1 = (number / 1000) % 10;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;

        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;

        int encryptedNumber = digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;

        System.out.printf("The encrypted integer is: %04d%n", encryptedNumber);

        input.close();
    }
}
