package com.lambdaschool;

public abstract class Money
{
    private String name;
    int quantity;
    private double value;

    Money(String name, int quantity, double value)
    {
        this.name = name;
        this.quantity = quantity;
        this.value = value;
    }

    public double getTotalValue()
    {
        return quantity * value;
    }

    public void addQuantity(int quantity)
    {
        this.quantity += quantity;
    }


    @Override
    public String toString() {
        if (quantity > 1)
        {
            return quantity + " " + name + "s";
        }
        return quantity + " " + name;
    }
}
