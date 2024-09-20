package chapter4;

import java.util.Scanner;

public class writeajavastatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = 5;

        X += X++ - 5;

        System.out.print("Enter any value for X:");
        X = input.nextInt();

        while (X <= 5) {
            System.out.print("Enter any value for X:");
            X = input.nextInt();

        }
    }
}
