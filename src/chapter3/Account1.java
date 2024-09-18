package chapter3;

public class Account1 {
    private static String name;

    public Account1(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }
}
