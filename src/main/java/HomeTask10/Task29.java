package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


//Имеется текст.Следует составить для него частотный словарь

public class Task29{

    public static void main (String[] args) throws IOException {
        getWordsFromFile ("Text.txt");
    }

    private static void getWordsFromFile (String path) throws IOException {
        BufferedReader reader = new BufferedReader (new FileReader (path));
        String line;
        StringBuilder text = new StringBuilder ();
        while ((line = reader.readLine ()) != null) {
            text.append (line).append (" ");
        }
        String[] words = text.toString ().split ("\\s*(\\s|,|!|\\.|\\?)+\\s*");
        ArrayList<String> list = new ArrayList<> (Arrays.asList (words) );
        Map<String, Integer> freqMap = new HashMap<> ();
        list.iterator ().forEachRemaining (s -> freqMap.merge (s.toLowerCase (), 1, Integer::sum) );
        freqMap.entrySet ().stream ()
                .sorted (descendingFrequencyOrder () )
                .forEach ( (entry) -> {
            Object key = entry.getKey ();
            Object value = entry.getValue ();
            System.out.println (key + " " + value);
        } );
    }


    private static Comparator<Map.Entry<String, Integer>> descendingFrequencyOrder () {

        return Comparator.<Map.Entry<String, Integer>>comparingInt ( Map.Entry::getValue ).reversed ().thenComparing ( Map.Entry::getKey );
    }

}
