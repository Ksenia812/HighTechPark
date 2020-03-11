package com.company.HomeTask2;

/**
 * The type Factorial.
 */
public class Factorial {

    /**
     * Factorial.
     *
     * @param args the args
     */
    public static void main(String args[]) {
        int number = 32;

        System.out.println(getFactorial(number));

    }

    private static int getFactorial(int number) {
        if (number < 0) {
            System.out.println("The input is error");
        }
        if (number == 0 || number == 1) {
            return 1;
        }

        return number * getFactorial(number - 1);
    }


}