package chapter4;

import java.util.Scanner;

public class worldpopulatiogrowth {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double growthRate = 0.0088;
        long currentPopulation = 8000000000L;
        long doublePopulation = currentPopulation * 2;

        System.out.printf("%-5s %-25s %-25s%n", "Year", "Population (End of Year)", "Population Increase");
        int doublingYear = -1;

        for (int year = 1; year <= 75; year++) {
            long populationIncrease = (long) (currentPopulation * growthRate);
            currentPopulation = populationIncrease;


            System.out.printf("%-5d %-25s %-25s%n", year, format(currentPopulation), format(populationIncrease));
        }
    }
}
