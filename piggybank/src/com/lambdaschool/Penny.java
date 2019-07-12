package com.lambdaschool;

public class Penny extends Money
{
    public Penny(int quantity)
    {
        super("Penny", quantity, 0.01);
    }

    public Penny()
    {
        super("Penny", 1, 0.01);
    }
}
