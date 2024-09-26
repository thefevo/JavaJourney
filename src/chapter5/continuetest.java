package chapter5;

import com.sun.jdi.PathSearchingVirtualMachine;

public class continuetest {
    public static void main(String[] args) {
        for (int count=1;count<=10;count++){
            if (count==5){
                continue;
            }
            System.out.printf("%d",count);
        }

        System.out.printf("%nused continue to printing 5%n");
    }
}
