package Lesson3.homework.task5;
// при входном массиве, вернуть массив массивов со всеми перестановками его элементов. (со звездочкой)
//Пример входных данных:
//[1,2,3]
//Пример выходных данных:
//[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(Arrays.deepToString(variousArras(array)));
    }

    /**
     *
     * @param array массив, с которым работаем
     * @return возвращает int[][] массив массивов со всеми перестановками элементов входного массива
     */
    private static int[][] variousArras(int[] array) {
        int length = array.length;
        int count = array.length * (array.length - 1);
        int[][] arrays = new int[count][length];
        int index = 0;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < length - 1 && index < count; j++) {
                int tmp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = tmp;
                System.arraycopy(array, 0, arrays[index], 0, length);
                index++;
            }
        }
        return arrays;
    }

}
