package com.company;

public class LocalCashCard extends CashCard{
    private boolean localPayment;

    public LocalCashCard (final int id, final boolean localPayment) {
        super (id);
        this.localPayment = localPayment;

    }

    @Override
    public int getId () {
        return 0;
    }



    public boolean isLocalPayment () {
        return localPayment;
    }

    public void setLocalPayment ( final boolean localPayment ) {
        this.localPayment = localPayment;
    }
    @Override
    public String toString () {

        return super.toString ()+"LocalCashCard{" + "localPayment=" + localPayment + '}';
    }
}
