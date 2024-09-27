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

        int newTrips = 1;

        while(trips != 0)
        {
            System.out.print("Enter miles driven: ");
           int  milesDriven = (int) input.nextDouble();

            System.out.print("Enter gallons Used: " );
           int gallonsUsed = (int) input.nextDouble();

            milesPerGallons = milesDriven / gallonsUsed;
            System.out.printf("Mile per gallons for trip %d is: %.2f%n%n", newTrips,  milesPerGallons);

            totalMilesPerGallons += milesPerGallons;
            newTrips++;

            System.out.print("Enter 1 to continue and 0 to end: ");
            trips = input.nextInt();


        }
        input.close();
//		this.tripCounter = newTrips;
        return totalMilesPerGallons;
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
