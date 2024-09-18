package chapter3;

public class Account2 {
    private String name;

    private double balance; // instance variable

    public Account2(String name, double balance) {
        this.name = name;

        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }

        public void deposit(double depositAmount) {
            if (depositAmount > 0.0) {
                balance = balance + depositAmount;
            }
        }

    public double getBalance(){
                return balance;
            }
            public void setName(String name) {
                 this.name = name;
                 }

             public static String getName() {
                return getName();
            }

        }

