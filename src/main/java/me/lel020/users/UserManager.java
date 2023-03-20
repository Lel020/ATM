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

        /**
         * Deposit
         */
        while (!isEmail);
        System.out.println("Please enter the amount you wish to deposit: ");
        double balance = scanner.nextDouble();
        deposit.depositAmount(balance);

        /**
         * Withdraw
         */
        System.out.println("Would you like to withdraw? (y/n)");
        String secondInput= scanner.next();

        double amountToWithdraw = 0;

        if(secondInput.equalsIgnoreCase("y")){
            System.out.println("How much would you like to withdraw? ");
            amountToWithdraw = scanner.nextDouble();
            balance -= amountToWithdraw;
            System.out.println("Your balance is now: " + balance);
        } else if (secondInput.equalsIgnoreCase("n")) {
            System.out.println("No money has been taken out of your account");
        }
        scanner.close();
    }

    public boolean isValidEmail(String email){
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return email.matches(regex);
    }

    public boolean isValidName(String name){
        String regex = "^[A-za-z]+([\\s'-][A-Za-z]+)$";
        return name.matches(regex);
    }
}
