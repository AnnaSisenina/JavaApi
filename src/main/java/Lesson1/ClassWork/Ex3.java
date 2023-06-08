package Lesson1.ClassWork;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scaner = new Scanner(System.in);
        String str = scaner.nextLine();
        System.out.println("zadanie3(str) = " + zadanie3(str));
        scaner.close();
    }

    /**
     * @apiNote Разделить строку пополам и склеить наоборот
     * @param str str
     * @return str
     */
    private static String zadanie3(String str) {
        String up = str.substring(0, str.length()/2);
        String down = str.substring(str.length()/2);
        return down + up;
    }
}
