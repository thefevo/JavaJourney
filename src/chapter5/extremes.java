package chapter5;

import java.util.Scanner;

public class extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many integers you want to print");

        int count=input.nextInt();

        if (count <= 0){
            System.out.println("Enter a positive number");
            return;

        }
        int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;

       for (int i=1;i<=count;i++);
       System.out.printf("Enter integer #" + 1 + ";");
       int number= input.nextInt();

       if (number<min){
           min=number;
       }
       //if (number>max){
          // max=number;
       }
    }
}
