package Assignment5;

class Bank {
    int accNumber;
    double accBalance;

    void displayAccount() {
        System.out.println("Account Number: " + accNumber);
        System.out.println("Balance: " + accBalance);
    }
}

class SavingsAccount extends Bank {
    double rate;

    void displaySavings() {
        displayAccount();
        System.out.println("Interest Rate: " + rate + "%");
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    int points;

    void displayPremium() {
        displaySavings();
        System.out.println("Reward Points: " + points);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        PremiumSavingsAccount acc = new PremiumSavingsAccount();

        acc.accNumber = 101;
        acc.accBalance = 50000;
        acc.rate = 6.5;
        acc.points = 250;

        acc.displayPremium();
    }
}