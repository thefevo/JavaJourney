package chapter2;

import java.util.Scanner;

public class AreaofaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the radius of the circle");

        int radius = input.nextInt();
        int diameter = 2 * radius;
        double circumference =  2 * 3.14159 * radius;
        double area =  3.14159 * radius;


            System.out.printf("diameter of a circle: %d%n", diameter);


            System.out.printf("circumference of a circle: %.2f%n",circumference);

            System.out.printf("Area of a circle: %.2f%n",area);
    }
}
