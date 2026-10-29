package Assignment6;

import java.util.Scanner;

public class LoginAttempt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "1234";
        int attempts = 1;

        while (attempts <= 3) {
            System.out.print("Enter your password: ");
            String password = sc.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Invalid Password");
            }

            attempts++;
        }

        sc.close();
    }
}