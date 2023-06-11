package Lesson2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mass = new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("zadanie4(mass) = " + zadanie4(mass));
    }

    /**
     * @param mass входящий массив
     * @return рез-тат
     * @apiNote 3)Дан массив целых чисел. Найти количество пар соседних элементов, где первый элемент вдвое больше второго.
     */
    private static int zadanie4(int[] mass) {
        int k = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] == mass[i + 1] * 2) {
                k++;
            }
        }
        return k;
    }
}
