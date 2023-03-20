package me.lel020.account;

import java.util.HashSet;

public class Withdraw {

    HashSet<Double> withdraw = new HashSet<Double>();

    /**
     * Adds a withdrawal amount to the set.
     *
     * @param amount - amount to be withdrawed.
     * @return
     */
    public double withdrawAmount(double amount) {
        //ERROR if balance is <= 0
        if (amount <= 0) {
            System.out.println("ERROR: You have $0 in the bank.");
        } else {
            withdraw.remove(amount);
        }
        return amount;
    }
}