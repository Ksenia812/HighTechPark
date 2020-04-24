package com.company;

public abstract class CashCard{

    private int id;


    public CashCard (final int id) {
        this.id = id;

    }

    public abstract int getId ();



    public void setId ( final int id ) {
        this.id = id;
    }
    @Override
    public String toString () {
        return "CashCard{" + "id=" + id + '}';
    }

}
