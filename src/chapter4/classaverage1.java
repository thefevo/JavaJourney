package chapter4;

import java.util.Scanner;

public class classaverage1 {
    public static void main(String[] args) {
        //create scanner to obtaiin input from windows command
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradecounter = 0;
        System.out.print("Enter grade or -1 to quit:");
        int grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            gradecounter = gradecounter + 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        if (gradecounter != 0) {

            double average = (double) total / gradecounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradecounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else {
            System.out.print("No grades were entered");
        }
    }
}

