package Lesson2.HomeWork;
//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int length = 10;
        int [] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers [i] = random.nextInt(-200,200);
        }
        System.out.println(Arrays.toString(numbers));
        int n = sumIndexOfTwoDigit(numbers);
        replaceNegativeNum(numbers, n);
        System.out.println(Arrays.toString(numbers));

    }

    /**
     *
     * @param array массив, с которым работаем
     * @param n - число, на которое заменяем отрицательные числа
     * @return масив, в котором все отрицательные числа заменены на число n
     */
    private static int [] replaceNegativeNum(int[] array, int n) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] < 0){
                array[i] = n;
            }
        }
        return array;
    }

    /**
     *
     * @param array массив, с которым работаем
     * @return сумма индексов двузначных элементов массива
     */
    private static int sumIndexOfTwoDigit(int [] array) {
        int sum = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i]>9 && array[i]<100 || array[i]<-9 && array[i]>-100){
                sum += i;
            }
        }
        return sum;
    }
}
