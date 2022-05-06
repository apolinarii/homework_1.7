package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);

        String fullNameUp = fullName.toUpperCase();
        System.out.println(fullNameUp);

        String fullNameRu = "Семёнов Семён Семёнович";
        String[] words = fullNameRu.split(" ");
        for (int i = 0; i < words.length; i++) words[i] = words[i].replace("ё", "e");
        String resultFullName = Arrays.toString(words)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        System.out.println("Данные ФИО сотрудника — " + resultFullName);




    }
}
