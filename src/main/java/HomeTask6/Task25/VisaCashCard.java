package com.company;

public class VisaCashCard extends InternationalCashCard{
    private boolean paymentOnTheNet;

    private VisaCashCard (final int id, final boolean abroadPayment, final boolean paymentOnTheNet) {
        super (id, abroadPayment);
        this.paymentOnTheNet = paymentOnTheNet;
    }

    public boolean isPaymentOnTheNet () {
        return paymentOnTheNet;
    }

    public void setPaymentOnTheNet (final boolean paymentOnTheNet) {
        this.paymentOnTheNet = paymentOnTheNet;
    }
    @Override
    public String toString () {
        return "VisaCashCard{" + "paymentOnTheNet=" + paymentOnTheNet + "} " + super.toString ();
    }
}
