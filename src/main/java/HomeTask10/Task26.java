package com.company;

import java.util.ArrayList;
import java.util.List;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
// Удалить неудовлетворительные оценки из списка

public class Task26{

    public static void main (String[] args) {

        List<Integer> marks = new ArrayList<> ();

        addMarksToTheList (marks);
        removeNegativeMarks (marks);

    }


    public static void addMarksToTheList (List<Integer> marks) {
        for (int i = 0; i < 10 ;i++) {
            marks.add (i, (int) (Math.random () * 10 + 1));


        }

    }

    public static void removeNegativeMarks (List<Integer> marks) {

        marks.removeIf (score -> score <= 3);
        System.out.println (marks);

    }
}
