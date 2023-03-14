package me.lel020.account;

import java.util.HashSet;

public class Withdraw {

    HashSet<Double> withdraw = new HashSet<Double>();

    public void withdrawAmount(double amount) {
        withdraw.remove(amount);
    }

    public HashSet<Double> getWithdraw() {
        return withdraw;
    }
}