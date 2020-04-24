package com.company;

public class InternationalCashCard extends CashCard{
    boolean abroadPayment;

    public InternationalCashCard (final int id, final boolean abroadPayment) {
        super (id);
        this.abroadPayment = abroadPayment;
    }

    @Override
    public int getId () {
        return 0;
    }


    public boolean isAbroadPayment () {
        return abroadPayment;
    }

    public void setAbroadPayment ( final boolean abroadPayment ) {
        this.abroadPayment = abroadPayment;
    }
    @Override
    public String toString () {

        return super.toString ()+"InternationalCashCard{" + "abroadPayment=" + abroadPayment + '}';
    }

}
