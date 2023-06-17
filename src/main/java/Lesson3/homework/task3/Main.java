package Lesson3.homework.task3;
//Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
// Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book firstBook = new Book("Война и мир", 991, "Толстой", 550, 2015);
        Book secondBook = new Book("Статский советник", 677, "Акунин", 350, 2010);
        Book thirdBook = new Book("Сборник стихов", 200, "Ахматова", 300, 2012);
        Book ForthBook = new Book("Охота на льва", 311, "Аннинский", 310, 2009);
        ArrayList<Book> books = new ArrayList<>();
        books.add(firstBook);
        books.add(secondBook);
        books.add(thirdBook);
        books.add(ForthBook);

        ArrayList<String> booksFilter = booksFilter(books);
        System.out.println(booksFilter.toString());

    }

    /**
     *
     * @param books список книг, среди которых осуществляем поиск
     * @return список с названиями книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
     */
    private static ArrayList<String> booksFilter(ArrayList<Book> books) {
        ArrayList<String> list = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().contains("А") && book.getYear()>=2010 && checkNumberOfPages(book.getNumberOfPages())){
                list.add(book.getName());
            }
        }
        return list;
    }

    /**
     *
     * @param numberOfPages Число страниц книги
     * @return возвращает true если у числа страниц 2 делаителя и false, если у исла страниц больше 2уух делителей
     */
    private static boolean checkNumberOfPages(int numberOfPages) {
        boolean check = true;
        int divides = 0;

        for (int i = 1; i <= numberOfPages && divides < 4 ; i++) {
            if ((numberOfPages % i) == 0){
                divides+=1;
            }
        }
        if (divides != 2) {
            check = false;
        }
        return check;
    }
}
