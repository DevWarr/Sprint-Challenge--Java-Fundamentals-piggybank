package com.lambdaschool;

public class Nickel extends Money
{
    public Nickel(int quantity)
    {
        super("Nickel", quantity, 0.05);
    }

    public Nickel()
    {
        super("Nickel", 1, 0.05);
    }
}
