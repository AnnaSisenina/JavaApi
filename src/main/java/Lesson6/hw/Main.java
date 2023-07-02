package Lesson6.hw;

import java.util.*;

/*        • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
       • Создать множество ноутбуков.
        • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
        “Введите цифру, соответствующую необходимому критерию:
        1 - ОЗУ
        2 - Объем ЖД
        3 - Операционная система
        4 - Цвет …
        • Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
        • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/

public class Main {
    public static void main(String[] args) {
        Laptop firstLaptop = new Laptop(16, 512, "Windows", "Black");
        Laptop secondLaptop = new Laptop(8, 256, "Windows", "Black");
        Laptop thirdLaptop = new Laptop(16, 512, "Windows", "White");
        Laptop fourthLaptop = new Laptop(8, 256, "MacOS", "White");
        Laptop fifthLaptop = new Laptop(16, 512, "MacOS", "White");

        List<Laptop> laptops = new ArrayList<>();
        laptops.add(firstLaptop);
        laptops.add(secondLaptop);
        laptops.add(thirdLaptop);
        laptops.add(fourthLaptop);
        laptops.add(fifthLaptop);

        FilteredList filteredList = new FilteredList(laptops);
        MainMenu(laptops, filteredList);
    }

    static void MainMenu(List<Laptop> laptops, FilteredList filteredList) {

        System.out.println("""
                Главное меню:
                 1. Вывести полный список ноутбуков
                 2. Применить фильтр
                 Выберете соответствующую цифру:\s""");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        switch (answer) {
            case 1 -> Print(laptops);
            case 2 -> {
                filteredList.Filter();
                filteredList.PrintFilteredList();
            }
            default -> {
            }
        }
    }

    static void Print(List<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            System.out.println(laptop.toString());
        }
    }


}
