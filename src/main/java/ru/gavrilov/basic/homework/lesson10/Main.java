package ru.gavrilov.basic.homework.lesson10;

public class Main {
    public static void main(String[] args) {
        int year = 2023;
        User[] userArr = {
                new User("Denis", "Gavrilov", "Igorevich", 1989, "nota@star.com"),
                new User("James", "Hetfield", "Alan", 1963, "metla@yeaaa.com"),
                new User("Freddie", "Mercury", "", 1946, "queen@brit.com"),
                new User("Chester", "Bennington", "Charles", 1976, "alternative@lp.com"),
                new User("Corey", "Taylor", "Todd", 1973, "slip@knot.com"),
                new User("Clifford", "Burton", "Lee", 1962, "metla@bass.com"),
                new User("Amy", "Lee", "Lynn", 1981, "evanes@cense.com"),
                new User("Tarja", "Susanna", "Soile", 1977, "night@wish.com"),
        };

        Box box = new Box(10, "черный");
        box.close();
        box.info();
        box.open();
        box.info();
        box.put("гитара");
        box.info();
        box.close();
        box.info();
        box.clear();
        box.info();
        box.open();
        box.put("телевизор");
        box.clear();
        box.put("телевизор");
        box.info();
        box.close();
        box.info();
        box.setColor("белый");
        box.info();

        for (int i = 0; i < userArr.length; i++) {
            if (year - userArr[i].getBirthYear() > 40) {
                userArr[i].userInfo();
                System.out.println();
            }
        }
    }
}
