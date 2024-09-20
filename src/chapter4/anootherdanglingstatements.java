package chapter4;

public class anootherdanglingstatements {
    public static void main(String[] args) {
        int X =0;
        int Y = 0;

        if (X < 9 );
        if (Y > 11) {
            System.out.println("*****");
        }else{
            System.out.println("#####");
            System.out.println("$$$$$");
        }
    }
}
