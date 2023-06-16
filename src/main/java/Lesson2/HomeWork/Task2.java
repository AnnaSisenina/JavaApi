package Lesson2.HomeWork;
//Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int [] numbers = {2, 5, 7, 8, 10};
        System.out.println("isIncreasing(numbers) = " + isIncreasing(numbers));

    }

    /**
     *
     * @param array массив, который проверяем
     * @return возращает true, если последовательность чисел в массиве возрастающая
     */
    private static boolean isIncreasing(int[] array) {
        boolean check = true;
        int length = array.length;
        for (int i = 1; i < length && check == true; i++) {
            if (array[i-1] >= array[i]) check = false;
        }
        return check;
    }
}