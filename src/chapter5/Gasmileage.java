package chapter5;

public class Gasmileage {
    //import java.util.Scanner;

    public class GasMileage {
        private double milesDriven;
        private double gallonsUsed;
        private double totalMilesPerGallons = 0; // Change to double
        int tripCounter = 0;

        public double calculateMilesPerGallons() { // Corrected method name

            double milesPerGallons;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter 1 to record miles driven and gallons used for each trip, and 0 to end:");
            int trips = input.nextInt();

            int newTrips = 0;

            while(trips != 0) {
                System.out.print("Enter miles driven: ");
                double milesDriven = input.nextDouble();  // No need to cast

                System.out.print("Enter gallons used: ");
                double gallonsUsed = input.nextDouble();  // No need to cast

                milesPerGallons = milesDriven / gallonsUsed;
                System.out.printf("Miles per gallon for trip %d is: %.2f%n", newTrips + 1, milesPerGallons);

                totalMilesPerGallons += milesPerGallons;  // Accumulate the total miles per gallon
                newTrips++;

                System.out.print("Enter 1 to continue and 0 to end: ");
                trips = input.nextInt();
            }
            input.close();
            this.tripCounter = newTrips; // Update trip counter
            return totalMilesPerGallons;
        }

        public static void main(String[] args) {
            GasMileage driver1 = new GasMileage();  // Create an object of GasMileage

            System.out.printf("%nTotal miles per gallon for all trips is: %.2f%n", driver1.calculateMilesPerGallons());
        }
    }

}
