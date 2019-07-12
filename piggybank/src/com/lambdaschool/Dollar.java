package com.lambdaschool;

public class Dollar extends Money
{
    public Dollar(int quantity)
    {
        super("Dollar", quantity, 1.00);
    }

    @Override
    public String toString() {
        return "$" + quantity;
    }
}