package chapter3;

import java.util.Scanner;

public class clockapplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter time in hour:");
        int hour = input.nextInt();
        System.out.print("Enter time in minute:");
        int minute = input.nextInt();
        System.out.print("Enter time in seconds:");
        int seconds = input.nextInt();

        clock display = new clock(hour,minute,seconds);

        System.out.print("\n THE TIME IS;");
        System.out.print("h: " + display.getHour());
        System.out.print(":");
        System.out.print("min:" + display.getMinute());
        System.out.print(":");
        System.out.print("sec:" + display.getSecond());

       // System.out.println("Realtime display"+ display.displaytime());


        double displaytime = display.displayTime();
        System.out.printf("The time is: %n %2f%n", displaytime);
    }
}
