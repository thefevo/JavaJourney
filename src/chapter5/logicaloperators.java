package chapter5;

public class logicaloperators {
    public static void main(String[] args) {
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%s:","conditional AND (&&)",
                "false && false",("false && false"),"false && true",("false && true"),
                "true && false",("true && false"),"true && true",("true && true"));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "conditional OR (||)","false || false",(false || false),
                "false || true",(false || true),"true || true",(true || true));

        System.out.printf("");
    }
}
