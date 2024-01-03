package ru.gavrilov.basic.homework.lesson20.client;

import java.io.*;
import java.net.Socket;

public class ClientApp {
    public static void main(String[] args) {
        try (
                Socket socket = new Socket("localhost", 8081);
                DataInputStream in = new DataInputStream(socket.getInputStream());
//                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
        ) {
            String serveResp;

            while ((serveResp = in.readUTF()) != null) {
                System.out.println("Server: " + serveResp);
                serveResp= in.readUTF();
                System.out.print("Server: " + serveResp);
//                System.out.print("Введите выражение или exit для выхода: ");
                String userInput = consoleIn.readLine();
                writer.println(userInput);
                if (userInput.equals("exit")) {
                    System.out.println("Bye ");
                    break;
                }
//                String result = reader.readLine();
                String result = in.readUTF();
                System.out.println("Результат: " + result);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
