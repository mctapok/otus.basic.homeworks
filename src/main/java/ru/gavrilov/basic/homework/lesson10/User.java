package ru.gavrilov.basic.homework.lesson10;

public class User {
    private String name;
    private String lastName;
    private String middleName;
    private int birthYear;
    private String email;

    public User(String name, String lastName, String middleName, int birthYear, String email) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.email = email;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void userInfo() {
        System.out.println("ФИО: " + name + " " + lastName + " " + middleName + "\n" +
                "Год рождения: " + birthYear + "\n" + "e-mail: " + email);
    }
}
