package chapter4;

import java.util.Scanner;

public class classanalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes=0;
        int failures=0;
        int studentcounter=1;

        while (studentcounter<=10){
            System.out.print("Enter results 1=pass 2=fail:");
            int result = input.nextInt();

            if(result ==1) {
                passes = passes + 1;
            }
            else{
                failures = failures + 1;
            }
            studentcounter = studentcounter + 1;
        }

        System.out.printf("Passed: %d%nfailed: %d%n",passes,failures);

        if(passes>8){
            System.out.println("Bonus to instructor!");
        }
    }
}
