package chapter3;
import java.util.Scanner;
public class AccountTest2 {
    public static void main(String[] args) {
        Account2 Account1 = new Account2("mary stone", 50.00);
        Account2 Account2 = new Account2("mary snow", -7.53);

        System.out.printf("%s balance: $%.2f%n", Account1.getName(), Account2.getBalance());
        //Account1.getName(),Account1.getBalance();
        System.out.printf("%s balance: $%.2f%n%n",Account2.getName(),Account2.getBalance());
        //Account2.getName(),Account2.getBalance();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1");
        double depositAmoount = input.nextDouble();
        System.out.printf("%nadding %.2f to Account1 balance%n%n", depositAmoount);
        Account1.deposit(depositAmoount);

        System.out.printf("%s balance: $ %n",Account1.getName(),Account1.getBalance() );
         System.out.printf("%s balance: $ %n%n",Account2.getName(),Account2.getBalance() );


        System.out.print("Enter deposit amount for account2: ");
       depositAmoount  = input.nextDouble();
        System.out.printf("%nadding %.2f to Account2 balance%n%n", depositAmoount);
        Account2.deposit(depositAmoount);

        System.out.printf("%s balance: $%.2f%n", Account1.getName(),Account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",Account2.getName(),Account2.getBalance());
        //Account1.getName(),Account1.getBalance();;
        //Account2.getName(),Account2.getBalance();;

    }
}
