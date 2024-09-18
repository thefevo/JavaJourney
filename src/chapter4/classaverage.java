package chapter4;

import java.util.Scanner;

public class classaverage {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int total = 0;
        int gradecounter = 1;

        while(gradecounter <= 10){
            System.out.print("Enter Grade:");
            int graded= input.nextInt();
            total= total + graded;
            gradecounter = gradecounter + 1;
        }

        int average=total/10;
        System.out.printf("%nTotal of all 10 grades is %d%n",total);
        System.out.printf("Class average is %d%n", average);
    }
}
