package com.lambdaschool;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DecimalFormat df = new DecimalFormat("$###,###.00");

        MoneyHolder piggyBank = new MoneyHolder();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        System.out.println("****MONEY ADDED INTO PIGGYBANK****");
        System.out.println(piggyBank);


        // Total Value


        System.out.println("\nThe piggy bank holds " + df.format(piggyBank.getTotalCash()));
    }
}
