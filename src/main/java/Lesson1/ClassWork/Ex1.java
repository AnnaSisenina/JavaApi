package Lesson1.ClassWork;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("subtractProductAndSum(n) = " + subtractProductAndSum(n));
        scanner.close();
    }

    /**
     * @param n заданное число
     * @return результат
     * @apiNote Заданное целое число возвращает разность между произведением его цифр на сумму его цифр. n
     */
    private static int subtractProductAndSum(int n) {
        int sum = 0, pr = 1;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n = n / 10;
        }
        return pr - sum;
    }
}
