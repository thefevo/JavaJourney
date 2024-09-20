package chapter4;

import java.util.Scanner;

public class checkerboardpatternofasterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        while (count <= 5) {
            System.out.println(count % 2 == 1 ? "* * * * *  * * *" : " *  *   *  *  * *");

            ++count;
        }
    }
}
