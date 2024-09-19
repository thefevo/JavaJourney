package chapter4;

import java.util.Scanner;

public class tabularoutput {
    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
        System.out.printf("%-4s %-4s %-4s %-4s%n","N","N2","N3","N4");

        for (int i=1;i<=5;i++){
            System.out.printf("%-4d %-4d %-4d %-4d%n", i, i * i, i * i * i, i * i * i * i);
        }

    }
}
