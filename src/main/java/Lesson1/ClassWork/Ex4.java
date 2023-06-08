package Lesson1.ClassWork;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println("zadanie4(a,b) = " + zadanie4(a, b));
        scanner.close();
    }

    private static String zadanie4(String a, String b) {
        if (a.length() < b.length()) {
            return zadanie4(b, a);
        }
        int carriage = 0;
        int j = b.length() - 1;
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carriage ++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                carriage ++;
            }
            result = carriage  % 2 + result;
            carriage  /= 2;
            j--;
        }
        if(carriage >0){
            result = carriage  % 2 + result;
        }
        return result;
    }


}
