package chapter3;

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.*;

public class THRapplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

       System.out.print("Enter your first name:");
        String firstname = input.nextLine();

        out.print("Enter your last name:");
        String lastname = input.nextLine();

        out.print("Enter birth month:");
        int birthmonth = input.nextInt();

        out.print("Enter birth day:");
        int birthday = input.nextInt();

        out.print("Enter birth year:");
        int birthyear = input.nextInt();

        THRclass person = new THRclass(firstname,lastname,birthmonth,birthday,birthyear);
        out.print("\nuser's information:");

        System.out.println("Name: " + person.getfirstname() + " " + person.getlastname());
        System.out.println("Date of Birth: " + person.getbirthmonth() + "/" + person.getbirthday() + "/" + person.getbirthyear());

        System.out.println("Age: " + person.getage() + " years");
        System.out.println("Maximum Heart Rate: " + person.getmaxhearthrate()+ ("  ") + "heart beat per minute");
        System.out.println("Target range of Heart Rate : " + person.getTargetHeartRateRange());

    }
}
