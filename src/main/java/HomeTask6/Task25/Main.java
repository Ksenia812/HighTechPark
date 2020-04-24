package com.company;

/*
 Создать иерархию классов,описывающих банковские карточки.
 Иерархия должна описывать хотя бы три уровня
 */
public class Main{


    public static void main (String[] args) {


        LocalCashCard mirCard = new LocalCashCard (454656, true);
        InternationalCashCard green = new InternationalCashCard (453646, true);

    }

}
