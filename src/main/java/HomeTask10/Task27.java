package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Создать коллекцию,наполнить ее случайными числами.
//Удалить повторяющиеся числа

public class Task27{

    public static void main ( String[] args ) {

        List<Integer> marks = new ArrayList<> ();

        addMarksToTheList (marks);
        removeRepeatedMarks (marks);
    }


    public static void addMarksToTheList (List<Integer> marks) {
        for (int i = 0; i < 10; i++) {
            marks.add (i, (int) (Math.random () * 10 + 1));

        }
        System.out.println (marks);
    }

    public static void removeRepeatedMarks (List<Integer> marks) {

        List<Integer> newMarks = marks.stream ()

                .distinct ()
                .sorted ()
                .collect (Collectors.toList ());
        System.out.println ("Modified List : " + newMarks);
    }
}
