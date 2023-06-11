package Lesson1.HomeWork;
// Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел, после которых следует отрицательное число.
//Пример ввода:
//1 2 1 2 -1 1 3 1 3 -1 0
//Логика расчета:
//2 -1 переход -> 2 в сумму
//3 -1 переход -> 3 в сумму
//Пример вывода: 5

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sumOfNums(sc) = " + sumOfNums(sc));

    }

    /**
     * @apiNote Возвращает из последовательности чисел сумму положительных чисел, после которых следует отрицательное число.
     * @param sc
     * @return int
     */

    private static int sumOfNums(Scanner sc) {
        int sum = 0;
        int a = sc.nextInt();
        while (a != 0) {
            int b = sc.nextInt();
            if(a > 0 && b < 0) sum=sum+a;
            a = b;
        }
        sc.close();

        return sum;
    }

}
