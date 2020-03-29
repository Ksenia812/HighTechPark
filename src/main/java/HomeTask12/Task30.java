package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Создать файл с текстом,прочитать,подсчитать в тексте количество знаков препинания и слов
public class Task30 {

    final static String path = "..\\text1.txt";

    public static void main(String[] args) throws IOException {

        System.out.println("Input the path to file:");
        Scanner scanner = new Scanner(System.in);
        String pathToFile = scanner.nextLine();
        Path path = Paths.get(pathToFile);
        BufferedReader reader = Files.newBufferedReader(path);
        String line;
        int wordsCount = 0;
        int punctuationAmount = 0;


        while ((line = reader.readLine()) != null) {
            for (int index = 0; index < line.length(); index++) {
                if (!((line.charAt(index) >= 'a' && line.charAt(index) <= 'z')
                        || ((line.charAt(index) >= 'A' && line.charAt(index) <= 'Z')) || line.charAt(index) == ' ')) {
                    punctuationAmount++;
                }
            }
            String[] wordList = line.split("\\s*(\\s|,|!|\\.|\\?|:|—)+\\s*");
            wordsCount += wordList.length;
        }

        System.out.println("Words count:" + wordsCount + ", Punctuation amount:" + punctuationAmount);
    }

}




