package chapter3;

public class Modified1 {
    private String name;

    private double balance; // instance variable

    public Modified1(String name, double balance) {
        this.name = name;

        if (balance > 0.0) { // if the balance is valid
            this.balance = balance; // assign it to instance variable balance
        }
    }

    public void setWithdrawAmount(double withdrawAmount) {
        if (withdrawAmount > 0.0) {
            balance = balance - withdrawAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void withdrawalexceeded(double withdrawalexceeded) {
        if (withdrawalexceeded >500)
            balance = withdrawalexceeded;
        }
    }




