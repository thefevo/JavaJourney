package chapter5;

import java.util.Scanner;

public class dowhiletest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;

        do {
            System.out.printf("%d ", counter);
           ++counter;
        } while (counter <= 10) ;
        System.out.println();
    }

}

