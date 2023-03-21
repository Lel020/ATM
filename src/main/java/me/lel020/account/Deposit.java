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
    public void depositAmount(double amount) {
          deposit.add(amount);
    }
}
