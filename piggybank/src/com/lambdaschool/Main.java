package com.lambdaschool;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MoneyHolder piggyBank = new MoneyHolder();
        Money penny = new Money("Penny", 0.01);
        Money nickel = new Money("Nickel", 0.05);
        Money dime = new Money("Dime", 0.10);
        Money quarter = new Money("Quarter", 0.25);
        Money dollar = new Money("Dollar", 1);

        piggyBank.add(quarter);
        piggyBank.add(dime);
        piggyBank.add(dollar, 5);
        piggyBank.add(nickel, 3);
        piggyBank.add(dime, 7);
        piggyBank.add(dollar);
        piggyBank.add(penny, 10);

        System.out.println("****MONEY ADDED INTO PIGGYBANK****");
        System.out.println(piggyBank);


        // Total Value
        DecimalFormat df = new DecimalFormat("$###,###.00");
        System.out.println("\nThe piggy bank holds " + df.format(piggyBank.getTotalValue()));

        // Removing money

    }
}
