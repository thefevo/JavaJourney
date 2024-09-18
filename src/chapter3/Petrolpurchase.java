package chapter3;

//import javax.xml.stream.Location;
import java.util.Scanner;

public class Petrolpurchase {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the petrol station location: ");
        String location = input.nextLine();

        System.out.print("Enter the type of petrol : ");
        String petrolType = input.nextLine();

        System.out.print("Enter the quantity of petrol in liters: ");
        int quantity = input.nextInt();

        System.out.print("Enter the price per liter: ");
        double pricePerLiter = input.nextDouble();

        System.out.print("Enter the percentage discount: ");
        double discount = input.nextDouble();

        // Create a PetrolPurchase object with the user-provided data
        Petrolclass purchase = new Petrolclass (location, petrolType, quantity, pricePerLiter, discount);

        // Display the details of the petrol purchase
        System.out.println("\nPetrol Purchase Details:");
        System.out.println("Location: " + purchase.getLocation());
        System.out.println("Petrol Type: " + purchase.getPetrolType());
        System.out.println("Quantity: " + purchase.getQuantity() + " liters");
        System.out.println("Price per Liter: $" + purchase.getPricePerLiter());
        System.out.println("Discount: " + purchase.getDiscount() + "%");

        // Calculate and display the net purchase amount
        double netAmount = purchase.getPurchaseAmount();
        System.out.printf("Net Purchase Amount: $%.2f%n", netAmount);
    }
}




