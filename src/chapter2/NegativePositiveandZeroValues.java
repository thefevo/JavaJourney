package chapter2;

import java.util.Scanner;

public class NegativePositiveandZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("s/n       positiveenumbers        negativenumbers    zeroinputs");
        int number = input.nextInt();
        int positivenumbers  = 0 + number;
        int  negativenumbers = - number;
        int zeroinputs = number * 0;

        int number1 = input.nextInt();
        int positivenumbers1  = 0 + number1;
        int  negativenumbers1 = - number1;
        int zeroinputs1 = number1 * 0;

        int number2 = input.nextInt();
        int positivenumbers2  = 0 + number2;
        int  negativenumbers2 = - number2;
        int zeroinputs2 = number2 * 0;

        int number3 = input.nextInt();
        int positivenumbers3  = 0 + number3;
        int  negativenumbers3 = - number3;
        int zeroinputs3 = number3 * 0;

        int number4 = input.nextInt();
        int positivenumbers4  = 0 + number4;
        int  negativenumbers4 = - number4;
        int zeroinputs4 = number4 * 0;


        System.out.printf(number +"     " +"       "+"       "+positivenumbers+"               "+ negativenumbers+"               "+zeroinputs);
                System.out.println("                     ");
        System.out.printf(number1 +"     " +"       "+"       "+positivenumbers1+"               "+ negativenumbers1+"               "+zeroinputs1);
        System.out.println("                     ");
        System.out.printf(number2 +"     " +"       "+"       "+positivenumbers2+"               "+ negativenumbers2+"               "+zeroinputs2);
        System.out.println("                     ");
        System.out.printf(number3 +"     " +"       "+"       "+positivenumbers3+"               "+ negativenumbers3+"               "+zeroinputs3);
        System.out.println("                     ");
        System.out.printf(number4 +"     " +"       "+"       "+positivenumbers4+"               "+ negativenumbers4+"               "+zeroinputs4);
        System.out.println("                     ");
    }
}
