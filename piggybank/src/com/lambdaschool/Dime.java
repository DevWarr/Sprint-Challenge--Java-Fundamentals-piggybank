package com.lambdaschool;

public class Dime extends Money
{
    public Dime(int quantity)
    {
        super("Dime", quantity, 0.10);
    }

    public Dime()
    {
        super("Dime", 1, 0.10);
    }
}
