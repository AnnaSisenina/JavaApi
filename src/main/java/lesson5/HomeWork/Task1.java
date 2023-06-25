package lesson5.HomeWork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
public class Task1 {
    public static void main(String[] args) {
        String string = "Россия идет вперед всей планеты. Планета - это не Россия.";
        String word = "Россия";
        CountWords(string, word);

    }

    /**Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом), вносить все слова не нужно
     *
     * @param string Строка, в которой ищем повторы слова
     * @param word Искомое слово
     */
    private static void CountWords(String string, String word) {
        String [] words = string.split("[\\s,.!-:;()]+");
        Map <String, Integer> countWords = new HashMap();
        countWords.put(word, 0);
        for (String s : words) {
            if (s.toLowerCase().equals(word.toLowerCase())){
                countWords.put(word, countWords.get(word) + 1);
            }
        }
        System.out.println(word + " - " + countWords.get(word));
    }
}
