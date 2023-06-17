package Lesson3.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Item> itemList = generateCollection(n, scanner);
        System.out.println("itemList = " + itemList);
        String searchName = scanner.nextLine();
        Integer sumVolume = 0;
        List<String> country = new ArrayList<>();
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getName().equals(searchName)) {
                sumVolume += itemList.get(i).getVolume();
                country.add(itemList.get(i).getCountry());
            }
        }
        System.out.println("country = " + country);
        System.out.println("sumVolume = " + sumVolume);
    }

    private static ArrayList<Item> generateCollection(int n, Scanner scanner) {
        ArrayList<Item> collection = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d элемент", i);
            Item item = new Item();
            item.setName(scanner.nextLine());
            item.setCountry(scanner.nextLine());
            item.setVolume(scanner.nextInt());
            collection.add(item);
        }
        return collection;
    }
}

