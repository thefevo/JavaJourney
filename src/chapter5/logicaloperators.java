package chapter5;

public class logicaloperators {
    public static void main(String[] args) {
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%s:","conditional AND (&&)",
                "false && false",("false && false"),"false && true",("false && true"),
                "true && false",("true && false"),"true && true",("true && true"));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "conditional OR (||)","false || false",(false || false),
                "false || true",(false || true),"true || true",(true || true));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logical AND (&)","false & false",(false & false),
                "false & true",(false & true),
                "true & false",(true & false),"treu & true",(true & true));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logical inclusive OR (|)","false | false",(false | false),
                "false | true",(false | true),"true | false",(true | false),
                "true | true",(true | true));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "boolean loogical inclusive OR (|)","false | false",(false | false),
                "false | true",(false | true),"true | false",(true | false),
                "true | true",(true | true));

        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%s",
                "Boolean logical exclusive OR(^)","false ^ false",(false ^ false),
                "false ^ true",(false ^ true),"true ^ false",(true ^ false),
                "true ^ true",(true ^ true));
        System.out.printf("%s%n%s: %b%n%s; %b%n","LOGICAL NOT (!)","!false",(!false),
                "!true",(!true));
    }
}
