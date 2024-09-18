package chapter3;

import java.util.Scanner;

public class CHRapplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print ("Enter your first name:");
                String firstname = input.nextLine();

                System.out.print("Enter your last name:");
                String lastname = input.nextLine();

                System.out.print("Gender:");
                String gender= input.nextLine();

                System.out.print("Enter month of birth from (1-12):");
                int birthmonth = input.nextInt();

                System.out.print("Enter the day of birth (1-31):");
                int birthday= input.nextInt();

                System.out.print("Enter year of birth:");
                int birthyear= input.nextInt();

                System.out.print("Enter height in inches:");
                double heightininches= input.nextDouble();

                System.out.print("Enter weight in pounds:");
                double weightinpounds= input.nextDouble();

                CHRclass PROFILE = new CHRclass(firstname,lastname,birthday,birthmonth,birthyear,gender,heightininches,weightinpounds);

                System.out.printf("%nHealth profile for %s %s:%n",PROFILE.getFirstname(),PROFILE.getLastname());
        System.out.printf("Gender: %s%n", PROFILE.getGender());
        System.out.printf("Date of Birth: %d/%d/%d%n", PROFILE.getBirthyear(), PROFILE.getbirthday(), PROFILE.getbirthmonth());
        System.out.printf("Height (inches): %.1f%n", PROFILE.getHeightInInches());
        System.out.printf("Weight (pounds): %.1f%n", PROFILE.getWeightInPounds());

        System.out.printf("Age: %d years%n", PROFILE.getage());
        System.out.printf("BMI: %.1f%n", PROFILE.calculateBMI());
        System.out.printf("Maximum Heart Rate: %d bpm%n", PROFILE.getmaxhearthrate());
        System.out.printf("Target Heart Rate Range: %s%n", PROFILE.gettargetheartraterange());
    }
}
