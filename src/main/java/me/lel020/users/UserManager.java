package me.lel020.users;

import me.lel020.account.Deposit;
import me.lel020.account.Withdraw;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    ArrayList <User> users = new ArrayList <User>();
    Deposit deposit = new Deposit();
    Withdraw withdraw = new Withdraw();

    public void addUser() {

        Scanner scanner = new Scanner(System.in);

        String name = null;
        String email = null;
        String password = null;

        boolean isName = false;
        boolean isEmail = false;

        /**
         * Name
         */
        do {
            System.out.println("Enter your first & last name: ");
            name = scanner.nextLine();
            isName = isValidName(name);

            if (!isName) { //this is for the regex method
                System.out.println("Invalid name format, please try again: ");
            }
        }
        while (!isName);
        System.out.println("Enter a password: ");
        password = scanner.nextLine();

        /**
         * Email
         */
        do {
            System.out.println("Enter your email: ");
            email = scanner.nextLine();
            isEmail = isValidEmail(email);

            if (!isEmail) {//this is for the regex method
                System.out.println("Invalid email, please try again: ");
            }
        }
        while (!isEmail);

        /**
         * Withdraw & Deposit
         */
        double balance = 0;

        while (true) {
            System.out.println("Would you like to withdraw or deposit? (w/d)");
            String input = scanner.next();

            if (input.equalsIgnoreCase("w")) {
                System.out.println("How much would you like to withdraw? ");
                double amountToWithdraw = withdraw.withdrawAmount(balance);
                balance -= amountToWithdraw;
                System.out.println("Your balance is now: " + balance);
                break;
            } else if (input.equalsIgnoreCase("d")) {
                System.out.println("Please enter the amount you wish to deposit: ");
                balance = scanner.nextDouble();
                deposit.depositAmount(balance);
                break;
            } else {
                System.out.println("INVALID: Please enter 'w' or 'd'");
            }
        }

        System.out.println("Thank you for using Lel's ATM!");
        scanner.close();
    }

    /**
     * Regex method for email validation
     * @param email
     */
    public boolean isValidEmail(String email){
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }

    /**
     * Regex method for name validation
     * @param name
     */
    public boolean isValidName(String name){
        String regex = "^[A-za-z]+([\\s'-][A-Za-z]+)$";
        return name.matches(regex);
    }
}
