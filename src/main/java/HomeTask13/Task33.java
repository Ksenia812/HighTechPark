package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
public class Task33 {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the path:");
        String pathToFile = scanner.nextLine();
        System.out.println("1.Get all the files of chosen folder;\n 2.Get all hidden files;\n 3.Get all folders(including hidden); ");
        int choice = scanner.nextInt();
//        Predicate
        Stream<Path> stream = null;
        try {
            switch (choice) {
                case 1:
                    stream = getFilesInFolder(pathToFile)
                            .filter(Files::isRegularFile);
                    break;
                case 2:
                    stream = getFilesInFolder(pathToFile)
                            .filter(path -> {
                                try {
                                    return Files.isHidden(path);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                return false;
                            });
                    break;
                case 3:
                    stream = getFilesInFolder(pathToFile)
                            .filter(Files::isDirectory);
                    break;
                default:
                    System.out.println("Error input");


            }
            stream.map(Path::toFile).collect(Collectors.toList()).forEach(System.out::println);
        } catch (NullPointerException e) {
        }
    }

    private static Stream<Path> getFilesInFolder(String pathToFile) throws IOException {
        return Files.walk(Paths.get(pathToFile));


    }
}
