package chapter5;

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double principal=1000.0;
        double rate=0.05;


        System.out.printf("%s%20s%n",  "year",   "Amount on deposit");

        for (int year=1;year<=10;++year){

            double amount = principal * Math.pow(1.0+ rate,year);

            System.out.printf("%4d%,20.2f%n",year,amount);
        }
    }
}
