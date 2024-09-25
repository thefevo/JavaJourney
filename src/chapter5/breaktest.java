package chapter5;

import java.util.Scanner;

public class breaktest {
    public static void main(String[] args) {
        //Scanner input= new Scanner(System.in);

        int count;
        for (count=1;count<=10;count++){
            if (count==5){
                break;
            }
            System.out.printf("%d",count);

        }
    }
}
