package chapter3;

public class AccountTest1 {
    public static void main(String[] args) {
        //create two account objects

        Account1 account1 = new Account1("john doe");
        Account1 account2 = new Account1("johnson doe");

        System.out.printf("Your account name is: %s%n%n",  account1.getName());
        System.out.printf("Your account name is: %s%n%n", account2.getName());
    }
}