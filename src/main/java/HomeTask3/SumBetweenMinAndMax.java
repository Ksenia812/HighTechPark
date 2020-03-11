package com.company.HomeTask3;


/**
 * The type SumBetweenMinAndMax.
 */
public class SumBetweenMinAndMax {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        int marks [] = {4,4,3,6,1,3,8};
        int sum = getSumBetweenMinAndMax(marks);
        System.out.println(sum);

    }

    /**
     * Gets sum between min and max.
     *
     * @param marks the array
     * @return the sum between min and max
     */
    public static int getSumBetweenMinAndMax(int[] marks) {
        int minIndex = 0;
        int maxIndex = 0;
        int sumNumber = 0;
        for ( int i = 0 ; i < marks.length ; i++ ) {
            if ( marks[i] > marks[maxIndex] ) {
                maxIndex = i;
            }
            if ( marks[i] < marks[minIndex] ) {
                minIndex = i;
            }
        }
        for ( int i = Math.min ( minIndex, maxIndex ) + 1 ; i < Math.max ( minIndex, maxIndex ) ; i++ ) {
            sumNumber += marks[i];
        }
       return sumNumber ;
    }
}