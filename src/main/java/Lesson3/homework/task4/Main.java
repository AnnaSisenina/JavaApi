package Lesson3.homework.task4;

import java.util.ArrayList;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            nums.add(rd.nextInt(0, 10));
        }
        System.out.println(nums.toString());
        int max = maxFromArray(nums);
        int min = minFromArray(nums);
        double average = averageFomArray(nums);
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);

    }

    /**
     *
     * @param list Список, с которым работаем
     * @return average среднее число из списка
     */
    private static double averageFomArray(ArrayList<Integer> list) {
        double average = 0;
        for (Integer integer : list) {
            average += integer;

        }
        return average/list.size();
    }

    /**
     *
     * @param list Список, с которым работаем
     * @return минималььное значение из списка
     */
    private static int minFromArray(ArrayList<Integer> list) {
        int min = list.get(0);
        for (Integer integer : list) {
            if (integer < min){
                min = integer;
            }
        }
        return min;
    }

    /**
     *
     * @param list Список, с которым работаем
     * @return максимальное значение из списка
     */
    private static int maxFromArray(ArrayList<Integer> list) {
        int max = list.get(0);
        for (Integer integer : list) {
            if (integer > max){
                max = integer;
            }
        }
        return max;
    }
}
