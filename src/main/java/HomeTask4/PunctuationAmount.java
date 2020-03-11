package com.company;

public class PunctuationAmount {

    public static void main ( String[] args ) {

        String input = "Hello,! $~+=#*- &@)world";
        System.out.println (getAmountOfSymbols ( input ));

    }

    public static int getAmountOfSymbols ( String input ) {
        int counter = 0;
        for ( int i = 0; i< input.length ();i++ )
        {
            if(!(input.charAt ( i )>= 'A' && input.charAt ( i )<= 'z' || input.charAt ( i ) == ' ') ){
                counter++;
            }
        }
        return counter;
    }
}