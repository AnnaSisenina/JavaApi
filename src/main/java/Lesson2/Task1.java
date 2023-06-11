package Lesson2;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {2, 6, 5, 8, 5, 4, 2};
        System.out.println(palindrom(array));
    }

    /**
     * @apiNote Дан массив целых чисел. Верно ли, что массив является симметричным.
     * @param array входной массив
     * @return результат
     */
    private static boolean palindrom(int[] array) {
        int len = array.length - 1;
        for (int i = 0; i < array.length/2; i++) {
            if(array[i] != array[len - i]) return false;
        }
        return true;
    }
}
