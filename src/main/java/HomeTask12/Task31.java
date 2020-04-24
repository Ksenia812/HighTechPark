package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Имеется файл с текстом,в котором присутствуют числа.Найти все числа,распечатать,посчитать сумму,убрать все повторяющиеся числа и снова распечатать
public class Task31 {

    public static void main(String[] args) throws IOException {

        System.out.println("Input the path to file");
        Scanner scanner = new Scanner(System.in);
        String pathToFile = scanner.nextLine();
        List<Integer> numbers = Stream.of(Files.lines(Paths.get(pathToFile), StandardCharsets.UTF_8).collect(Collectors.joining())
                .replaceAll("[^-?0-9]+", " ").trim().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        numbers.forEach(System.out::println);

        Integer sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("The sum is :" + sum);
        numbers.stream().distinct().forEach(s -> System.out.print(s + " "));
    }
}
