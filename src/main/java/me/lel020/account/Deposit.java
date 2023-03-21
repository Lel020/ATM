package me.lel020.account;

import java.util.HashSet;
public class Deposit {

    HashSet<Double> deposit = new HashSet<Double>();

    /**
     * Adds a deposit amount to the set.
     * @param amount - amount to be deposited.
     */
    public void depositAmount(double amount){
        if(amount > 10_000){
            System.out.println("You can only deposit up to $10,000");
        }
        deposit.add(amount);
    }
}
