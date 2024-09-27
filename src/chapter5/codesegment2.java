package chapter5;

import java.util.Scanner;

public class codesegment2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=0;
        for (int k = (int) 0.1; k !=1.0; k += 0.1){
            System.out.println(k);

            switch(n) {
                case 1:
                    System.out.println("The number is 1");
                case 2:
                    System.out.println("The number is 2 ");
                    break;
                default:
                    System.out.println("The number is not 1 or 2");
                    break;

            }
        }
    }
}
