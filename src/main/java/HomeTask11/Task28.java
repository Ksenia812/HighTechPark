package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//Найти самую высокую оценку с использованием итератора.

public class Task28{

    public static void main (String[] args) {

        List<Integer> marks = new ArrayList<> ();

        addMarksToTheList (marks);
        System.out.println (findMaxMark (marks));


    }


    public static void addMarksToTheList (List<Integer> marks) {
        Random random = new Random ();

        for (int i = 0; i < 20; i++) {

            marks.add (random.nextInt (10) + 1);

        }
        System.out.println (marks);
    }

    public static int findMaxMark (List<Integer> marks) {

        Iterator iterator = marks.iterator ();
        int maxMark = marks.get (0);
        iterator.next ();
        while (iterator.hasNext ()) {
            int element = (int) iterator.next ();
            if (element > maxMark) {
                maxMark = element;
            }


        }
        return maxMark;
    }
}