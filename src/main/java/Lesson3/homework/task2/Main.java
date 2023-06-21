package Lesson3.homework.task2;

import java.util.ArrayList;
import java.util.Scanner;

// Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
// Получить наименования товаров заданного сорта с наименьшей ценой.
public class Main {
    public static void main(String[] args) {
        Product firstProduct = new Product("Пшеница", 50, "Высший", "Россия", 1.0);
        Product secondProduct = new Product("Ячмень", 70, "2", "Беларусь", 1.0);
        Product thirdProduct = new Product("Геркулес", 50, "3", "Россия", 1.0);
        Product fourthProduct = new Product("Рис", 80, "2", "Китай", 1.0);
        Product fifthProduct = new Product("Полба", 70, "2", "Россия", 1.0);
        ArrayList<Product> products = new ArrayList<>();
        products.add(firstProduct);
        products.add(secondProduct);
        products.add(thirdProduct);
        products.add(fourthProduct);
        products.add(fifthProduct);
        ArrayList<String> minPrice = minPrice(products);
        System.out.println(minPrice.toString());


    }

    /**
     * Выводит наименования товаров заданного сорта с наименьшей ценой
     * @param products список товаров, среди которых осуществляется поиск
     * @return ArrayList<String> список товаров аданного сорта с наименьшей ценой
     */
    private static ArrayList<String> minPrice(ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        String sort = sc.nextLine();
        int minPrice = Integer.MAX_VALUE;
        ArrayList<String> names = new ArrayList<>();
        for (Product product : products) {
            if (product.getSort().toLowerCase().equals(sort.toLowerCase()) && product.getPrice() < minPrice) {
                minPrice = product.getPrice();
            }
        }
        for (Product product : products) {
            if (product.getSort().toLowerCase().equals(sort.toLowerCase()) && product.getPrice() == minPrice) {
                names.add(product.getName());
            }
        }
        return names;
    }
}
