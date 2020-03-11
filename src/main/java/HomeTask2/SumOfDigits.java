package com.company.HomeTask2;

/**
 * The type SumOfDigits.
 */
public class SumOfDigits {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        int number = 123654;
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Сумма цифр в числе " + number + " = " + sum);
    }


}



