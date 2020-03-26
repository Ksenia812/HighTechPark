package com.company;

import java.io.*;
import java.util.ArrayList;
//Записать в двоичный файл 20 случайных чисел.Прочитать файл,распечатать числа и их среднее арифметическое
public class Task32 {

    public static void main(String[] args) throws FileNotFoundException {


        int sum = 0;
        int arithmeticMean = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        // запись в файл
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("hello.bin"))) {
            // записываем значения
            for (int index = 0; index < 20; index++) {
                dos.writeInt((int) (Math.random() * 10 + 1));
            }
            System.out.println("File has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        // обратное считывание из файла
        try (DataInputStream dos = new DataInputStream(new FileInputStream("hello.bin"))) {
            // записываем значения
            for (int index = 0; index < 20; index++) {
                int number = dos.readInt();
                sum += number;
                System.out.println("Number: " + number);
            }
            arithmeticMean = sum / 20;
            System.out.println(arithmeticMean);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }


    }
}
