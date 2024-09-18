package chapter4;

public class increment {
    public static void main(String[] args) {
        int c =5;
        System.out.printf("c before postdecrement: %d%n",c);
        System.out.printf(" post incrementing: %d%n",c++);
        System.out.printf("c after postincrement %d%n:",c);

        System.out.println();

        c=5;
        System.out.printf("c before preincrementing: %d%n",c);
        System.out.printf(" poat incrementing: %d%n",++c);
        System.out.printf("c after preincrement %d%n:",c);
    }
}
