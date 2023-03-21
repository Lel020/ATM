package me.lel020.account;

import java.util.HashSet;
import java.util.Scanner;

public class Deposit {

    HashSet<Double> deposit = new HashSet<Double>();
    Scanner scanner = new Scanner(System.in);

    /**
     * Adds a deposit amount to the set.
     * @param amount - amount to be deposited.
     */
    public void depositAmount(double amount){
        while(amount > 10_000){
            System.out.println("You can only deposit up to $10,000");
            System.out.println("Please enter an amount <= $10,000");
            amount = scanner.nextDouble();
            deposit.add(amount);
        }
    }
}
