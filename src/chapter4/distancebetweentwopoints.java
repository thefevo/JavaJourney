package chapter4;

import java.util.Scanner;

public class distancebetweentwopoints {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int X1=0;
       int Y1=0;
       int X2=0;
       int Y2=0;

       System.out.print("Enter the co-ordinate of X1 axis:");
       X1= input.nextInt();

       System.out.print("Enter the co-ordinate of Y1 axis:");
       Y1=input.nextInt();

       System.out.print("Enter the co-ordinate of X2:");
       X2= input.nextInt();

       System.out.print("Enter the co-ordinate of Y2 axis:");
       Y2= input.nextInt();

       if (X1==X2){
           System.out.println("The line is perpendicular to the x asis.");
       }else if (Y1==Y2){
           System.out.println("the line is perpendicular to the Y axix.");
       }else{
           System.out.println("The line is perpendicular to none.");
       }
       input.close();



    }
}
