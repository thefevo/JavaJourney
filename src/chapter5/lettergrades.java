package chapter5;

import java.util.Scanner;

public class lettergrades {
    public static void main(String[] args) {

        int total=0;
        int gradecounter=0;
        int acount=0;
        int bcount=0;
        int ccount=0;
        int dcount=0;
        int fcount=0;
        Scanner input=new Scanner(System.in);

        System.out.printf("%s%n%s%n   %s%n  %s%n","Enter the integer grades from 0-100:",
                "Type the end-of-file indicator to terminate input:",
                "On unix/linus/macos type <ctrl> d then press enter",
                "On windows type <ctrl> z then press Enter");

        while (input.hasNext()){
            int grade= input.nextInt();
            total +=grade;
            ++gradecounter;
        }


    }
}
