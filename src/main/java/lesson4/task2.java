package lesson4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("linkedList = " + linkedList);
    }

    /**
     * @param n количество элементов в созданном списке
     * @return новый список
     */

    private static LinkedList<Integer> createList(int n) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(10));
        }
        return linkedList;
    }
}
