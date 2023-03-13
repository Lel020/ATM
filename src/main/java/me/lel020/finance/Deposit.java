package me.lel020.finance;

import java.util.HashSet;
public class Deposit {

    HashSet<Double> deposit = new HashSet<Double>();

    public void depositAmount(double amount){
        deposit.add(amount);
    }
}
