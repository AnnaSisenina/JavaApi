package Lesson3.homework.task1;
//Дан массив записей: наименование товара, цена, сорт.
// Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».

import Lesson3.task2.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product firstProduct = new Product("Пшеница, сорт высший", 100, "высший");
        Product secondProduct = new Product("Пшеница, сорт 1", 90, "1");
        Product thirdProduct = new Product("Пшеница, сорт высший", 50, "3");
        Product fourthProduct = new Product("Пшеница, сорт высший", 70, "2");
        Product fifthProduct = new Product("Пшеница, сорт Высший", 80, "1");
        ArrayList<Product> products = new ArrayList<>();
        products.add(firstProduct);
        products.add(secondProduct );
        products.add(thirdProduct);
        products.add(fourthProduct);
        products.add(fifthProduct);
        int maxPrice = maxPrice(products);
        System.out.println(maxPrice);

    }

    /**
     * Возвращает наибольшую цену товара из заданного списка среди товаров 1го или 2-го сорта, название которых содержит «высший»
     * @param productList - список товаров среди которых осуществляем поиск
     * @return Возвращает наибольшую цену товара
     */
    private static int maxPrice(ArrayList<Product> productList) {
        int maxPrice = -1;
        for (Product product : productList) {
            if (product.getName().toLowerCase().contains("высший") &&
                    (product.getSort().equals("1") || product.getSort().equals("2"))){
                if (product.getPrice()>maxPrice){
                    maxPrice = product.getPrice();
                }
            }
        }
        return maxPrice;
    }


}
