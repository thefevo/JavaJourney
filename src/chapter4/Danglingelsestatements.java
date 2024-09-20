package chapter4;

import java.util.Scanner;

public class Danglingelsestatements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = 0;
        int Y = 0;

        if (X > 5) ;
        if (Y > 5) {
            System.out.println("X and Y > 5");
        } else {
            System.out.println("X is <=5");
        }
    }
}
