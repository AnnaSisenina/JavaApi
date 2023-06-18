package lesson4;
// Заменить некратные 3 элементы списка, суммой нечетных элементов

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("linkedList = " + linkedList);

        zadanie3(linkedList);
    }


    private static void zadanie3(LinkedList<Integer> linkedList) {
        int sum = 0;
        for (Integer el : linkedList) {
            if (el % 2 != 0) {
                sum += el;
            }
        }
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) % 3 != 0) {
                linkedList.set(i, sum);
            }
        }
        System.out.println("linkedList = " + linkedList);
    }

    private static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10));
        }
        return linkedList;
    }
}
