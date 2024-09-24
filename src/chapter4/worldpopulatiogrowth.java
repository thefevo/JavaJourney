package chapter4;

import java.rmi.server.LogStream;
import java.util.Scanner;

public class worldpopulatiogrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double growthRate = 0.0088;
        long currentPopulation = 8000000000L;
        long doublePopulation = currentPopulation * 2;

        System.out.printf("%-5s %-25s %-25s%n", "Year", "Population (End of Year)", "Population Increase");
        int doublingYear = -1;

        for (int year = 1; year <= 75; year++) {
            long populationIncrease = (long) (currentPopulation * growthRate);
            currentPopulation = populationIncrease;

            //String formatter;
            System.out.printf("%-5d %-25s %-25s%n", year, currentPopulation, populationIncrease);

            if (doublingYear == -1 && currentPopulation >= doublePopulation) {
                doublingYear = year;

            }
        }
        if (doublingYear != -1) {
            System.out.println("The population will double in year: " + doublingYear);
        } else {
            System.out.println("The population will not double within the next 75 years.");
        }
    }
}