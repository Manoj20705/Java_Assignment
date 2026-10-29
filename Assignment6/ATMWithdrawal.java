package Assignment6;

import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPIN = 1234;
        int balance = 5000;

        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        if (pin == correctPIN) {
            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawal successful!");
                System.out.println("Remaining balance: Rs." + balance);
            } else {
                System.out.println("Error: Insufficient balance!");
            }
        } else {
            System.out.println("Error: Incorrect PIN!");
        }

        sc.close();
    }
}
