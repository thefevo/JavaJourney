package chapter4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class rightangledtriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int k = 2;

        System.out.print("Enter the base length of the triangle between (1-10):");
        int baselength = input.nextInt();

        while (baselength < 1 || baselength > 10) {
            System.out.print("invalid input;Enter a length between (1-10)");
            baselength = input.nextInt();
            }
            for (i = 1; i <= baselength; i++) {
                 for  ( k=1;k<=1;k++)

                System.out.print("*");
            }
            System.out.println();
        }
    }

