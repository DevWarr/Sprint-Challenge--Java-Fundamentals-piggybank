package com.lambdaschool;

public class Money
{
    private String name;
    private double value;

    Money(String name, double value)
    {
        this.name = name;
        this.value = value;
    }

    public double getValue()
    {
        return value;
    }

    public double getTotalValue(int quantity)
    {
        return quantity * value;
    }

    public String display(int quantity) {
        if (name == "Dollar")
        {
            return "$" + quantity;
        }
        if (quantity > 1)
        {
            return quantity + " " + name + "s";
        }
        return quantity + " " + name;
    }
}
