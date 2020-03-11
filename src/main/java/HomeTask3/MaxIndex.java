package com.company.HomeTask3;

import java.util.Random;

/**
 * The type MaxIndex.
 */
public class MaxIndex {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Random random = new Random();

        int[] marks = new int[20];
        int maxMark = marks[0];
        int i;
        int maxIndex = 0;
        for (i = 0; i < marks.length; i++) {

            marks[i] = (random.nextInt(100) - 10);
            if (maxMark <= marks[i]) {
                maxMark = marks[i];
                maxIndex = i;
            }

            System.out.println("Mark: " + marks[i] + "Number" + i);
        }

        System.out.println("Maximum :" + " " + maxMark + " Number" + "  " + maxIndex);
    }
}
