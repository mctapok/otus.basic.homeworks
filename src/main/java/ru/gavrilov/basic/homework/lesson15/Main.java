package ru.gavrilov.basic.homework.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 4, 5, 3, 6, 4, 6, 5, 6));

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(new Employee("chandler", 31), new Employee("ross", 32), new Employee("joe", 30)));


        System.out.println(minMax(3, 8));
        System.out.println(sumAboveFive(arrayList));
        System.out.println(replaceNum(5, arrayList));
        System.out.println(increaseNum(1, arrayList));
        System.out.println(employeeName(employeeList));
        System.out.println(olderThen(employeeList, 31));
        System.out.println(averageAge(employeeList, 30));
        System.out.println(youngestEmp(employeeList).getName());


    }


    public static List<Integer> minMax(int min, int max) {
        List<Integer> arrayList = new ArrayList<>();
        if (min > max) {
            System.out.println("data err: min > max");
            return arrayList;
        }
        for (int i = min; i <= max; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    public static int sumAboveFive(List<Integer> arrayList) {
        int sum = 0;
        for (Integer integer : arrayList) {
            if (integer > 5) {
                sum += integer;
            }
        }
        return sum;
    }

    public static List<Integer> replaceNum(int num, List<Integer> arrayList) {
        arrayList.replaceAll(ignored -> num);
        return arrayList;
    }

    public static List<Integer> increaseNum(int num, List<Integer> arrayList) {
        int newNum;
        for (int i = 0; i < arrayList.size(); i++) {
            newNum = arrayList.get(i) + num;
            arrayList.set(i, newNum);
        }
        return arrayList;
    }

    public static List<String> employeeName(List<Employee> employeeList) {
        List<String> nameList = new ArrayList<>();
        for (Employee employee : employeeList) {
            nameList.add(employee.getName());
        }
        return nameList;
    }

    public static List<String> olderThen(List<Employee> employeeList, int minAge) {
        List<String> ageList = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getAge() >= minAge) {
                ageList.add(employee.getName());
            }
        }
        return ageList;
    }

    public static boolean averageAge(List<Employee> employeeList, int minAverageAge) {
        int sum = 0;
        for (Employee employee : employeeList) {
            sum += employee.getAge();
        }
        int average = sum / employeeList.size();
        return average > minAverageAge;
    }

    public static Employee youngestEmp(List<Employee> employeeList) {
        Employee youngestE = employeeList.get(0);

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getAge() < youngestE.getAge()) {
                youngestE = employeeList.get(i);
            }
        }
        return youngestE;
    }
}

