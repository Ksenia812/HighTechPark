package com.company;


public class WordAmount {

    public static void main ( String[] args ) {


        String line = " Finding somewhere affordable to  live in Britain is hard ";

        int wordsCounter = 1;

        line = line.trim ();


        for ( int i = 0 ; i < line.length () ; i++ ) {

            if ( line.charAt ( i ) == ' ' && line.charAt ( i + 1 ) != ' ' ) {

                wordsCounter++;
            }
        }
        System.out.println ( "Amount of words : " + wordsCounter );

    }
}
