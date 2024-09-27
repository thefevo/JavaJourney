package chapter4;

import java.util.Scanner;

public class gasmileage {
    private double milesdriven;
    private double gallonsused;
    private int totalMilesPerGallons = 0;
    int tripCounter = 0;

    public double calculateMilespergallons() {

        double milesPerGallons;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1 to record miles driven and gallons used for each trips and  to end ");
        int trips = input.nextInt();
    //public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        //int miles;
        //int gallon;
       // System.out.print("Enter the miles driven:");
       // miles =input.nextInt();

        //System.out.print("Enter the gallon used:");
       // gallon= input.nextInt();

        //double tripmilespergallon=(double) gallon/miles;
       // System.out.printf("miles per gallon for this trip %.2f%n:",tripmilespergallon);

       // int totalMiles = miles;
        //int totalgallon=gallon;

       // double combinedmilespergallon=(double) totalgallon/totalMiles;
       // System.out.printf("combined miles per gallon for the trip so far %.2f%n:",combinedmilespergallon);

       // System.out.println("");

        //System.out.println("Thank you that's all for this trip!");
    }
}
