package chapter4;

import java.util.Scanner;

public class factorialA {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a non-negative integer n");
        int n=input.nextInt();

        if (n<0){
            System.out.println("Invalid input:Enter a non-negative integer.");
        }else{
            long factorial=1;

            for (int i=1;i<=n;n++){
                factorial *= i;
            }
            System.out.printf("The factorial of %d is: %d%n", n, factorial);
        }
        input.close();
    }
}
