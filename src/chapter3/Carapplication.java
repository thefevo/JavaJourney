package chapter3;

import java.util.Scanner;

public class Carapplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the model of your car:");
        String carmodel = input.nextLine();

        System.out.print("Enter the year the car was bought:");
        String yearofcar = input.nextLine();

        System.out.print("input the price of the car:");
        String priceofcar = input.nextLine();



        System.out.print("input discount on first car:");
        double getdiscount = input.nextDouble();



        Carclass purchase = new Carclass(carmodel,yearofcar,priceofcar,getdiscount);

        System.out.print("\n ENTER CAR PURCHASE DETAILS;");
        System.out.println("carmodel: " + purchase.getCarmodel());
        System.out.println("yearofcar:" + purchase.getYearofcar());
        System.out.println("priceofcar:" + purchase.getPriceofthecar());
       ;
        System.out.println("getdiscount"+ purchase.getGetDiscount());


        double netAmount = purchase.getdiscountoncar();
        System.out.printf("New car price Amount: $%.2f%n", netAmount);

    }
}
