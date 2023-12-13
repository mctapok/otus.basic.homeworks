package ru.gavrilov.basic.homework.lesson19;

import java.io.*;
import java.util.Scanner;

public class IOApp {
    public static void fileList(File fileDirectory) {
        File[] fileList = fileDirectory.listFiles();
        assert fileList != null;
        System.out.println("file list: ");
        for (int i = 0; i < fileList.length; i++) {
            File file = fileList[i];
            System.out.println(file.getName());
        }
    }

    public static void displayFileContent(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUserInput(Scanner scanner, String message) {
        StringBuilder separator = new StringBuilder();
        separator.append("-".repeat(message.length()));
        System.out.println(separator);
        System.out.println(message);
        System.out.println(separator);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        File fileDirectory = new File("files");
        if (!fileDirectory.exists()){
            fileDirectory.mkdir();
        }
        Scanner scanner = new Scanner(System.in);

        String fileName;
        File selectedFile;
        String userInput;

        fileList(fileDirectory);

        do {
            fileName = getUserInput(scanner, "type name of the file or type exit");
            if (fileName.equalsIgnoreCase("exit")) {
                System.out.println("program closing");
                return;
            }

            selectedFile = new File(fileDirectory + "//" + fileName);
            if (!selectedFile.exists() || selectedFile.isDirectory()) {
                System.out.println("file not found or its a directory");
            }
        } while (!selectedFile.exists() || selectedFile.isDirectory());

        displayFileContent(selectedFile);

        do {
            userInput = getUserInput(scanner, "add text or type exit");

            if (!userInput.equalsIgnoreCase("exit")) {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile, true));
                    writer.write(userInput + "\n");
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } while (!userInput.equalsIgnoreCase("exit"));
    }
}