package ru.gavrilov.basic.homework.lesson20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8081)) {
            System.out.println("Server up");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("client connected " + clientSocket);
                clientHandler(clientSocket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void clientHandler(Socket clientSocket) throws IOException {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)
                DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
        ) {
            while (true) {
                out.writeUTF("Доступные операции: +, -, *, /");
                out.writeUTF("Введите выражение или exit для выхода: ");
                String input = reader.readLine();
                if (input.equals("exit")) {
                    System.out.println("client disconnected " + clientSocket);
                    break;
                }
                try {
                    String[] parts = input.split(" ");
                    double num1 = Double.parseDouble(parts[0]);
                    double num2 = Double.parseDouble(parts[2]);
                    char operator = parts[1].charAt(0);
                    double result = operation(num1, operator, num2);
                    //                    writer.println(String.format("%.2f", result));
                    out.writeUTF(String.format("%.2f", result));
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
                    out.writeUTF("input error");
                    //                    writer.println("input error");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double operation(double num1, char operator, double num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("деление на 0");
                }
            default:
                throw new IllegalArgumentException("неверная операция");
        }
    }

}
