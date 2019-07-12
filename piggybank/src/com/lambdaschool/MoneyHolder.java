package com.lambdaschool;

import java.util.HashMap;

public class MoneyHolder
{
    private HashMap<Money, Integer> moneyIntegerHashMap;

    public MoneyHolder()
    {
        this.moneyIntegerHashMap = new HashMap<>();
    }

    public void add(Money m)
    {
        if (moneyIntegerHashMap.containsKey(m))
        {
            moneyIntegerHashMap.put(m, moneyIntegerHashMap.get(m) + 1);
        }
        else
        {
            moneyIntegerHashMap.put(m, 1);
        }
    }

    public void add(Money m, int quantity)
    {
        if (moneyIntegerHashMap.containsKey(m))
        {
            moneyIntegerHashMap.put(m, moneyIntegerHashMap.get(m) + quantity);
        }
        else
        {
            moneyIntegerHashMap.put(m, quantity);
        }
    }

    public double getTotalValue() {
        double total = 0;
        for (HashMap.Entry<Money, Integer> m : moneyIntegerHashMap.entrySet())
        {
            total += m.getKey().getTotalValue(m.getValue());
        }
        return total;
    }

    public String removeMoney(Money m, int quantity)
    {
        if (!moneyIntegerHashMap.containsKey(m))
        {
            return "This type of money is not in the piggyBank.";
        }
        if (!(moneyIntegerHashMap.get(m) >= quantity))
        {
            return "The piggyBank doesn't have enough of this money to remove.";
        }
        moneyIntegerHashMap.put(m, moneyIntegerHashMap.get(m) - quantity);
        return "You have taken " + m.display(quantity) + " out of the piggyBank.";
    }

    public void removeAmount(double amount)
    {

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\n");
        for (HashMap.Entry<Money, Integer> m : moneyIntegerHashMap.entrySet())
        {
            str.append(m.getKey().display(m.getValue())).append("\n");
        }
        return str.toString();
    }
}
