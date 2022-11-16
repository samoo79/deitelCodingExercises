package tdd;

public class Account {

    private int balance;



    public void deposit(int amount) {
        if(amount > 0) {
            balance = balance + amount;
        }
    }
    public void withdrawal (int amount) {
        int minimum = 1000;
        if (amount >= 0 && amount <= balance) {
            balance = balance - (amount - minimum);
        }
    }
    public int getBalance() {

        return balance;
    }

        }




