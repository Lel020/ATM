package me.lel020.account;

import java.util.HashSet;

public class Withdraw {

    HashSet<Double> withdraw = new HashSet<Double>();

    public void withdrawAmount(double amount) {
        if(amount <= 0){
            System.out.println("ERROR: You have $0 in the bank.");
        }
        else {
            withdraw.remove(amount);
        }
    }

    public HashSet<Double> getWithdraw() {
        return withdraw;
    }
}