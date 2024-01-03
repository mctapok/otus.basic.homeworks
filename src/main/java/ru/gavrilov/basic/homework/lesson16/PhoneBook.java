package ru.gavrilov.basic.homework.lesson16;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> book = new HashMap<>();

    public void add(String name, String phone) {
        String lowercaseName = name.toLowerCase();
        Set<String> phones = book.get(lowercaseName);
        if (phones == null) {
            phones = new HashSet<>();
            book.put(lowercaseName, phones);
        }
        phones.add(phone);
    }

    public void find(String name){
        String lowercaseName = name.toLowerCase();
//        if (!book.containsKey(lowercaseName)){
//            System.out.println("not found");
//            return;
//        }
         System.out.println(book.get(lowercaseName));
    }

    public boolean containsPhoneNumber(String phone){
        for (Set<String> phones : book.values()){
            if(phones.contains(phone)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PhoneBook book1 = new PhoneBook();

        book1.add("Voland", "66666666");
        book1.add("Voland", "66666999");
        book1.add("Master", "11155566");
        book1.find("voland");
        book1.find("bob");
        System.out.println(book1.containsPhoneNumber("1155566"));
        System.out.println(book1.containsPhoneNumber("66666999"));
    }
}
