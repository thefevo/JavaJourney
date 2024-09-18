package chapter2;

import java.util.Scanner;

public class Statisticsforthegreatpyramidofgiza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Statistiics for the great pyramid of giza;");
        System.out.println("           ");

        System.out.print("The Estimated number of stone used to build it:");
        long estimatednumber= input.nextLong( );
        System.out.println("           ");

        System.out.print("Average numer of each stone used to build it in ton:");
        double averageweight= input.nextDouble();
        System.out.println("           ");
        System.out.print("Number of years it took to build it in years:");
        double numbeofyears= input.nextDouble();


    }
}
