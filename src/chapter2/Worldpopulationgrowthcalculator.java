package chapter2;

import java.util.Scanner;

public class Worldpopulationgrowthcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("world population growth calculator");
        System.out.println("                ");

       // int population1 = input.nextInt();
        //int growthrate1 = input.nextInt();
        //int population1 = input.nextInt();
         //population1 = 8,161,972,572;

        //int growthrate1 = input.nextInt();
        // growthrate1 =  0.87%;

        //System.out.printf("world population growth for 2024 %d%n %d%n:", population1 , growthrate1);
        System.out.print("Enter the current world population: ");
        long Population = input.nextLong();

        System.out.print("Enter the annual growth rate (as a percentage): ");
        double growthRate = input.nextDouble();

        System.out.print("Enter the second world population: ");
        long Population1 = input.nextLong();

        System.out.print("Enter the second annual growth rate (as a percentage): ");
        double growthRate1 = input.nextDouble();

        System.out.print("Enter the third world population figure: ");
        long Population2 = input.nextLong();

        System.out.print("Enter the third annual growth rate (as a percentage): ");
        double growthRate2 = input.nextDouble();

        System.out.print("enter the fourth world population figure:");
        long population3 = input.nextLong();

        System.out.print("Enter the fourth annual growth rate (as a percentage):");
        double growthrate4 = input.nextDouble();

        System.out.print("Enter the fivth world population figure:");
        long population5 = input.nextLong();

        System.out.print("Enter the fivth annual growth rate (as a percenttage):");
        double growthrate = input.nextDouble();


        //int population2 = input.nextInt();
        //int growthrate2 = input.nextInt();

        //int population3 = input.nextInt();
       // int growthrate3 = input.nextInt();

        //int population4 = input.nextInt();
        //int growthrate4 = input.nextInt();

        //int population5 = input.nextInt();
        //int growthrate5 = input.nextInt();


    }
}
