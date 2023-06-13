package Lesson2.HomeWork;
//Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int length = random.nextInt(10,20);
        int [] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers [i] = random.nextInt(0,30);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("sumOfPrimes(numbers) = " + sumOfPrimes(numbers));
    }

    /**
     *
     * @param array - массив, с которым работаем
     * @return сумма простых чисел в массиве. Простое число - это натуральное число, которое не равно 1 и имеющее два различных натуральных делителя, 1 и само себя.
     */
    private static int sumOfPrimes(int[] array) {
        int result = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            if (array[i] > 1){
                int count = 0;
                for (int j = 1; j <= array[i] && count < 3; j++) {
                    if (array[i]%j == 0){
                        count++;
                    }
                }
                if (count<3){
                    result++;
                }
            }
        }
        return result;
    }

}

