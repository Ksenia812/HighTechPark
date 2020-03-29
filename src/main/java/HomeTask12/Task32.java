package com.company;

        import java.io.*;
        import java.nio.charset.Charset;
        import java.nio.charset.StandardCharsets;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.ArrayList;
        import java.util.List;

//Записать в двоичный файл 20 случайных чисел.Прочитать файл,распечатать числа и их среднее арифметическое
public class Task32 {
    final static String path = "..\\hello.bin";

    public static void main(String[] args) throws FileNotFoundException {


        int sum = 0;
        int arithmeticMean = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        // запись в файл
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(path))) {
            // записываем значения
            for (int index = 0; index <= 20; index++) {
                dataOutputStream.writeInt((int) (Math.random() * 10 + 1));
            }
            System.out.println("File has been written");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        // обратное считывание из файла

        // записываем значения
        int count = 0;
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            int result = in.readInt();
            while (in.available() > 0) {

                sum += result;
                count++;
                result = in.readInt();
                System.out.println(result);

            }
            arithmeticMean = sum / count;
            System.out.println(count + "*");

        } catch (IOException e) {
            System.out.println("ERROR");
        }


        System.out.println(arithmeticMean);


    }
}

