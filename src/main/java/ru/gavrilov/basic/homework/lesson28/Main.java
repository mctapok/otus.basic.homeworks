package ru.gavrilov.basic.homework.lesson28;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "";
        File file;
        String fileName = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите название файла или \"/q\" для выхода: ");
            fileName = scanner.nextLine();
            if (fileName.equals("/q")) break;
            file = new File(fileName);
            System.out.print("Введите искомую последовательность символов: ");
            s = scanner.nextLine();
            try {
                int result = compare(file, s);
                System.out.println("Обнаружено повторений:  " + result);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("ОШИБКА: файл не найден");
            }
        }
    }

    private static int compare(File file, String s) throws FileNotFoundException {
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        int ind = 0;
        String tmp;
        try (FileReader reader = new FileReader(file)) {
            for (int i = 0; i < file.length(); i++) {
                char c = (char) reader.read();
                if (c == s.charAt(ind)) {
                    stringBuilder.append(c);
                    ind++;
                } else {
                    ind = 0;
                    stringBuilder = new StringBuilder();
                }
                if (ind > s.length() - 1) {
                    ind = 0;
                }
                tmp = stringBuilder.toString();
                if (s.equals(tmp)) {
                    counter++;
                    ind = 0;
                    stringBuilder = new StringBuilder();
                }
            }
            return counter;
        } catch (IOException e) {
            throw new FileNotFoundException("file not found");
        }
    }
}
