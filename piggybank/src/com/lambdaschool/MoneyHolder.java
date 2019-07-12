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

    public void removeMoney(double amount)
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
