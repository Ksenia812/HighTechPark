package com.company.HomeTask4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LastLetter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner ( System.in );

        System.out.println ( "Input the line: " );

        String input = scanner.nextLine ();

        for( Character symbol : getLastLetter(input) ){
            System.out.printf ( symbol.toString () );

        }
    }
        public static ArrayList <Character> getLastLetter( String input) {

            ArrayList list = new ArrayList <Character>();
            Pattern pattern = Pattern.compile ( "\\s*(\\s|,|!|\\.|\\?)+\\s*" );

            String[] text = pattern.split ( input );
            for ( int i = 0 ; i < text.length ; i++ ) {

                list.add ( text[i].charAt ( text[i].length() - 1 ) );
            }
            return  list;

        }


}
