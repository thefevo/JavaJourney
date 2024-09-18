package chapter2;

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("choose the  unit system you want");

    System.out.println("1. weight in pounds and height in inches");

    System.out.println("2.weight in kilograms and height in meters");

    int choose = input.nextInt();
     int weightinpound;
     int heightininches;
    int weiightinkilograms;
     int heightinmeters;

    //public static int calculateBMI(int weight, int height) {
        //int BMI = weight / height * height;
       // return BMI;
    //}

    //public int calculateBMIPounds(int weight, int height) {
        //int BMI2 = weight * 703 / height * height;
        //return BMI2;
    //}


    //public static void main(String[] args) {


        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter weight in Kilogram: ");
        //int weight1 = input.nextInt();

        //System.out.println("Enter height in metres: ");
        //int height = input.nextInt();
        //int BodyMaxindex = input.nextInt();
        //int calculateBMI = input.nextInt();

        //BodyMaxindex user = new BodyMaxindex();

        //System.out.println("Body Max Index is: " +user.calculateBMI (weight1, height) + "\n");
        //input.close();

       // System.out.println("BMI values\nunderweight: less than 18.5\nNormal: between 18.5 and 24.9\noverweight: between 25 and 29.9\nobese: 30 or greater");
   // }
//}

        //double BMI = 0;
        //double BMI1 = 0;

        int BMI = 1;
        int BMI1 = 2;

        if (choose == 1);
       {
            System.out.print("enter your weight in pounds: ");
             weightinpound = input.nextInt();

            System.out.print("enter your height in inches");
              heightininches = input.nextInt();

             BMI  = weightinpound * 703 / heightininches * heightininches;

            System.out.print("BMI value %d:");
            System.out.printf("Your BMI is: .%f%n", BMI);

        }



         if (choose == 2);
        {
            System.out.print("enter weight in kilograms");
             weiightinkilograms = input.nextInt();


            System.out.print("enter height in meters");
              heightinmeters = input.nextInt();

            BMI1 = weiightinkilograms / heightinmeters * heightinmeters;

            System.out.printf("Your BMI is: .%f%n", BMI1);
        }
        if (choose != 0);
        {

            System.out.printf("BMI: .f%n%",BMI,BMI1);
            System.out.printf("Your BMI is: %d%n", BMI);
            System.out.printf("Your BMI2 is: %d%n",BMI1);

            System.exit(0);
        }


        //System.out.printf("Your BMI is: .%f%n", BMI);

        // Display BMI categories
       // System.out.println("\nBMI Categories:");
      //  System.out.println("Underweight: less than 18.5");
       // System.out.println("Normal weight: 18.5 – 24.9");
        //System.out.println("Overweight: 25 – 29.9");
       // System.out.println("Obesity: 30 or greater");


       // if (BMI < 18.5) {
      //     System.out.println("You are underweight.");
      //  } else if (BMI >= 18.5 && BMI <= 24.9) {
         //   System.out.println("You have a normal weight.");
       // } else if (BMI >= 25 && BMI <= 29.9) {
           // System.out.println("You are overweight.");
     //  } else
         //   System.out.println("You are obese.");
        }
    }
