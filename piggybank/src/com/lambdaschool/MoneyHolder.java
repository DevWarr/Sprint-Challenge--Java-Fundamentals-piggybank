package com.lambdaschool;

import java.util.ArrayList;

public class MoneyHolder
{
    private ArrayList<Money> moneyList;

    public MoneyHolder()
    {
        this.moneyList = new ArrayList<>();
    }

    public void add(Money m)
    {
        moneyList.add(m);
    }

    public double getTotalCash() {
        double total = 0;
        for (Money m : moneyList)
        {
            total += m.getTotalValue();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\n");
        for (Money m : moneyList)
        {
            str.append(m).append("\n");
        }
        return str.toString();
    }
}
