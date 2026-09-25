package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int CURRENT_YEAR = 2026;
        int birthYear;

        while (true) {
            System.out.print("Введите год рождения: ");
            birthYear = scanner.nextInt();

            if (birthYear > CURRENT_YEAR) {
                System.out.println("Ошибка: год рождения не может быть в будущем. Попробуйте снова.");
            } else {
                break;
            }
        }
            int age = CURRENT_YEAR - birthYear;

            if (age < 18) {
                System.out.println("Вы несовершеннолетний");
            } else if (age <= 65) {
                System.out.println("Вы взрослый");
            } else {
                System.out.println("Вы пенсионер");
            }
            scanner.close();

        }
    }