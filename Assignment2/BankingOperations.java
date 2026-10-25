package Assignment2;

public class BankingOperations {

    double deposit(double balance, double amount) {
        return balance + amount;
    }

    double withdraw(double balance, double amount) {
        if (amount <= balance)
            return balance - amount;

        System.out.println("Insufficient funds!");
        return balance;
    }

    void checkBalance(double balance) {
        System.out.println("Current Balance: " + balance);
    }

    void displayTransactionSummary(double openingBalance,double depositAmount,double withdrawalAmount,double closingBalance) {
        System.out.println("Initial Balance: " + openingBalance);
        System.out.println("Deposited: " + depositAmount);
        System.out.println("Withdrawn: " + withdrawalAmount);
        System.out.println("Final Balance: " + closingBalance);
    }

    public static void main(String[] args) {
        BankingOperations obj = new BankingOperations();

        double openingBalance = 5000.0;
        double depositAmount = 2000.0;
        double withdrawalAmount = 1500.0;

        double updatedBalance = obj.deposit(openingBalance, depositAmount);
        updatedBalance = obj.withdraw(updatedBalance, withdrawalAmount);

        obj.checkBalance(updatedBalance);

        obj.displayTransactionSummary(openingBalance, depositAmount, withdrawalAmount, updatedBalance);
    }
}
