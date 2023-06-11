package Lesson2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("zadanie3(n, scanner) = " + zadanie3(n, scanner));
    }

    /**
     * @apiNote 2)Дана последовательность из N целых чисел. Найти сумму чисел,
     * оканчивающихся на 5, перед которыми идет четное число.
     * @param n длинна последовательности
     * @param scanner вспомогающий класс
     * @return сумму чисел, которые заканчиваются на 5 и предедущее число четное
     */
    private static int zadanie3(int n, Scanner scanner) {
        int sum = 0;
        int n1 = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int n2 = scanner.nextInt();
            if (n2 % 10 == 5 && n1 % 2 == 0) {
                sum += n2;
            }
            n1 = n2;
        }
        return sum;
    }
}
