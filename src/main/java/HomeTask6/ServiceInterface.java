package com.company;

import java.util.List;

public interface ServiceInterface {
    List<CashCard> getCardList ();

    CashCard getCardById ( List<CashCard> cardList, String id );

    boolean isValidId ( List<CashCard> cardList, String id );

    boolean isValidPassword ( CashCard cashCard, String password, int amountOfAttempts );

    void getBalanceFromCashCard ( CashCard cashCard );

    boolean addMoneyToCashCard ( CashCard cashCard, int moneyDenomination );

    int getCardIndex ( List<CashCard> cardList, CashCard cashCard );

    boolean takeMoneyFromCashCard ( CashCard cashCard, int money );
}
