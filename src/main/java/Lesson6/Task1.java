package Lesson6;

//1)Дан массив чисел, посчитать процент уникальных чисел.
//*процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        Set<Integer> set = new HashSet<>(list);
        System.out.println("list = " + list);
        System.out.println("set = " + set);
        int result = set.size() * 100 / list.size();
        System.out.println("result = " + result);

    }
}
