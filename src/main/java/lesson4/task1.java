package lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(scanner.nextInt());
        }
        System.out.println("linkedList = " + linkedList);
        scanner.close();
        System.out.println("linkedList.peek() = " + linkedList.peek());
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.pop() = " + linkedList.pop());
        System.out.println("linkedList = " + linkedList);
        linkedList.push(1);
        System.out.println("linkedList = " + linkedList);
        linkedList.add(2);
        linkedList.addLast(3);
        linkedList.addFirst(3);
        System.out.println("linkedList = " + linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("linkedList = " + linkedList);
        System.out.println("linkedList.contains(3) = " + linkedList.contains(3));
    }

}
