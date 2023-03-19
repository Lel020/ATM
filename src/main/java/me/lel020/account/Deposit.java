package me.lel020.account;

import java.util.HashSet;
public class Deposit {

    HashSet<Double> deposit = new HashSet<Double>();

    /**
     * Adds a deposit amount to the set.
     * @param amount - amount to be deposited.
     */
    public void depositAmount(double amount){
        deposit.add(amount);
    }
}
