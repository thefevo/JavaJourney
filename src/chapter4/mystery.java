package chapter4;

public class mystery {
    public static void main(String[] args) {
        int x = -2;
        int total =0;

        while (x <=0) {
            int y = x + 2;
            x++;
            total += y;
            System.out.printf("Y is: %d and total is %d\n", y, total);
        }

    }
}
