package Assignment4;

class BankAccount {
    private String accountHolder;
    private double accountBalance;

    BankAccount(String holder, double balance) {
        accountHolder = holder;
        accountBalance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountHolder(String holder) {
        accountHolder = holder;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }

    public static void main(String[] args) {
        BankAccount customer = new BankAccount("Ravi", 5000);

        System.out.println("Name: " + customer.getAccountHolder());
        System.out.println("Balance: " + customer.getAccountBalance());

        customer.withdraw(2000);

        System.out.println("Remaining Balance: " +
                customer.getAccountBalance());
    }
}