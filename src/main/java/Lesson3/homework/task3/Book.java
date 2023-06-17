package Lesson3.homework.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    String name;
    int numberOfPages;
    String author;
    int price;
    int year;
}
