package com.lambdaschool;

public class Dollar extends Money
{
    public Dollar()
    {
        super("Dollar", 1.00);
    }

    public String display(int quantity) {
        return "$" + quantity;
    }
}
