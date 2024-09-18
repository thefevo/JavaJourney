package chapter3;
import java.util.Scanner;
public class Modifiedaccount {
    public static void main(String[] args) {
        Modified1 Account1 = new Modified1("paul campbell", 500.00);

        System.out.printf("%s balance: $%.2f%n", Account1.getName(), Account1.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amount to withdraw:");
        double withdrawAmoount = input.nextDouble();
        System.out.printf("%nadding %.2f to Account1 balance%n%n", withdrawAmoount);
        Account1.setWithdrawAmount(withdrawAmoount);

        System.out.printf("%s balance:  $ %n",Account1.getName(),Account1.getBalance() );

        System.out.printf("%s balance: $%.2f%n", Account1.getName(),Account1.getBalance());



        if (withdrawAmoount > -1);
        //if (withdrawalAmount => 500)
        //System.out.print("withdrawal exceeded");
        Modified1 Account2 = new Modified1("paul campbell account exceeded or not",withdrawAmoount );
        double withdrawalexceeded = input.nextDouble();


       System.out.printf("%nadding %.2f to Account1 exceeded balance%n%n", withdrawalexceeded);
       Account1.withdrawalexceeded(withdrawalexceeded);
        System.out.printf("%s withdrawalexceeded:  $ %n",Account1.getBalance());
        System.out.printf("Withdrawal exceeded the balance in the account %n", withdrawalexceeded );

       //if (withdrawalexceeded == 0.0);
           // System.out.printf("Withdrawal succesful");
           // System.out.printf("Withdrawal exceeded the balance in the account");
           //System.exit(0);

       // }
            //System.out.printf("Withdrawal succesful");
            //System.out.printf("Withdrawal exceeded the balance in the account");
        //System.exit(0);
    }
}
