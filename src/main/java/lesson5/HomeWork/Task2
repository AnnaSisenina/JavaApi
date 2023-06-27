package lesson5.HomeWork;
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));
        countAndSortNames(names);
    }

    /**
     * Находит и выводит из списка, содержащего строки с именем и фамилией, повторяющиеся имена с количеством повторений, отсортированные по убыванию популярности.
     * Строки должн ыбыть заполнены следующим образом - имя на первом месте, фамилия - на втором.
     * @param names - список, с которым работаем
     */
    private static void countAndSortNames(List<String> names) {
        Map<String, Integer> countAndSortNames = new HashMap<>();
        for (String name : names) {
            String[] splitName = name.split(" ");
            countAndSortNames.putIfAbsent(splitName[0], 0);
            countAndSortNames.put(splitName[0], countAndSortNames.get(splitName[0]) + 1);
        }
        int[] counts = new int[countAndSortNames.size()];
        int index = 0;
        for (String s : countAndSortNames.keySet()) {
            counts[index] = countAndSortNames.get(s);
            index++;
        }
        System.out.println();
        Arrays.sort(counts);
        int length = counts.length;
        int check = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (counts[i] != check) {
                for (String s : countAndSortNames.keySet()) {
                    if (countAndSortNames.get(s) == counts[i]) {
                        System.out.println(s + " - " + countAndSortNames.get(s));
                    }
                }
            }
            check = counts[i];
        }
    }
}
