package com.example;

public class Main2 {
    static void main() {

        int[] numbers = {10, 5, 8, 3, 12, 7, 4, 9, 6, 11};

        int sumEven = 0;
        int countOdd = 0;

        System.out.println("Элементы массива:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            } else {
                countOdd++;
            }
        }
        System.out.println("Сумма четных элементов: "+ sumEven);
        System.out.println("Кол-во нечетных элементов:" + countOdd);
    }
}
