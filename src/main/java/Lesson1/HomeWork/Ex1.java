package Lesson1.HomeWork;

//Reverse Words in a String

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = sc.nextLine();
        System.out.println(reverseWords(string));
    }

    /**
     * @apiNote Разворот строки, разделение слов по пробелам и удаление лишних пробелов
     * @param s String
     * @return String
     */
    private static String reverseWords(String s) {
        String [] words = s.trim().split("\\s+");
        int length = words.length;
        s="";
        for (int i = 0; i < length; i++) {
                if (i>0)
                    s = words[i] + " " +s;
                else
                    s = words[i];
        }

        return s;
    }
}
