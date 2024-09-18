package chapter2;

import javax.naming.spi.DirStateFactory;
import java.util.Scanner; // program uses scanner

public class product {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer");

        int x = input.nextInt();

        System.out.print("Enter the second integer");

        int y = input.nextInt();

        System.out.print("Enter the third integer");

        int z = input.nextInt();

        int result = x * y * z;

        System.out.printf("product is %d%n", result);

    }
}
