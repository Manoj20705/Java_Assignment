package Assignment3;

public class BankAccount {

    int accNo;
    String accHolder;
    double amount;

    BankAccount() {
        accNo = 1001;
        accHolder = "Priya";
        amount = 5000.0;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Holder Name: " + accHolder);
        System.out.println("Balance: " + amount);
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        b1.displayAccount();
        b2.displayAccount();
    }
}