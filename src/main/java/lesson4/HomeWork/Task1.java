package lesson4.HomeWork;

import java.util.LinkedList;
import java.util.Scanner;

import static java.util.Collections.reverse;

//1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//Пример:
//1->2->3->4
//Вывод:
//4->3->2->1
public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("linkedList = " + linkedList);
        reverse(linkedList);
        System.out.println("linkedList = " + linkedList);
        myReverse(linkedList);

    }

    /**
     * Выводит на экран список в перевернутом виде
     * @param linkedList Список, с которым работаем
     */
    private static void myReverse(LinkedList<Integer> linkedList) {
        int last = linkedList.size()-1;
        for (int i = 0; i < linkedList.size()/2; i++) {
            int temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(last-i));
            linkedList.set(last-i,temp);
        }
        System.out.println("linkedList = " + linkedList);
    }
}
