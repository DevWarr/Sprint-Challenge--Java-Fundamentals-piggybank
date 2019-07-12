package com.lambdaschool;

public class Quarter extends Money
{
    public Quarter(int quantity)
    {
        super("Quarter", quantity, 0.25);
    }

    public Quarter()
    {
        super("Quarter", 1, 0.25);
    }
}
