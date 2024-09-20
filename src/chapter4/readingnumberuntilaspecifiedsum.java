package chapter4;

import java.util.Scanner;

public class readingnumberuntilaspecifiedsum {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        int number;

        System.out.print("Enter a any number:");
        number = input.nextInt();



        while(sum<number){
        System.out.print("Enter an another number higher than the initial::");
        number= input.nextInt();

        sum+=number;

        System.out.printf("current sum of that number:"+sum,"=");
        }
        System.out.printf("The total sum is now %d,which is equals or greater than the number lower number picked %d.%n",sum,number);


    }
}
