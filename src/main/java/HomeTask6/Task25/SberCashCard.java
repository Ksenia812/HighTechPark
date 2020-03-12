package com.company;

public class SberCashCard extends LocalCashCard{
    private boolean paymentInOtherTerminals;

    public SberCashCard (final int id, final boolean localPayment, final boolean paymentInOtherTerminals) {
        super (id, localPayment);
        this.paymentInOtherTerminals = paymentInOtherTerminals;
    }



    public boolean isPaymentInOtherTerminals () {
        return paymentInOtherTerminals;
    }

    public void setPaymentInOtherTerminals ( final boolean paymentInOtherTerminals ) {
        this.paymentInOtherTerminals = paymentInOtherTerminals;
    }
    @Override
    public String toString () {
        return "SberCashCard{" + "paymentInOtherTerminals=" + paymentInOtherTerminals + "} " + super.toString ();
    }
}
