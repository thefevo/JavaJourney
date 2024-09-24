package chapter5;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int total=0;

        for (int number=2;number<=20;number+=2){
            total +=number;
        }

        System.out.printf("sum is %d%n",total);

    }
}
