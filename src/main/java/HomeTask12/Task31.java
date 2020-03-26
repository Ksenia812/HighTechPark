package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Имеется файл с текстом,в котором присутствуют числа.Найти все числа,распечатать,посчитать сумму,убрать все повторяющиеся числа и снова распечатать
public class Task31 {

    public static void main(String[] args) throws IOException {


        Path path = Paths.get("text.txt");
        BufferedReader reader = null;

        reader = Files.newBufferedReader(path);


        String line;
        Set<Integer> distinctNumbers = new HashSet<>();


        String number = "";

        List<Integer> numbers = new ArrayList<>();
        int sum = 0;
        while ((line = reader.readLine()) != null) {
            for (int index = 0; index < line.length(); index++) {
                if (line.charAt(index) >= '0' && line.charAt(index) <= '9') {
                    number += line.charAt(index);
                    if (index == line.length() - 1 || !(Character.isDigit(line.charAt(index + 1)))) {
                        numbers.add(Integer.parseInt(number));
                        number = "";
                    }
                }
            }

        }
        for (Integer integer : numbers) {
            sum += integer;
            System.out.print(integer + " ");

            distinctNumbers.add(integer);
        }
        System.out.println(sum);
        distinctNumbers.forEach(s -> System.out.print(s + " "));

    }
}





