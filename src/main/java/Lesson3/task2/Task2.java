package Lesson3.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Student student1 = new Student("Иванов", 23, 1000, List.of(3, 4, 4));
        Student student2 = new Student("Петрова", 13, 1500, List.of(5, 4, 4));
        Student student3 = new Student("Сидорова", 14, 1300, List.of(3, 5, 4));
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        for (Student student : students) {
            int sum = sumScores(student.getScores());
            if (student.getName().endsWith("ова") && sum % 2 == 0) {
                System.out.println(student.getSalary());
            }

        }


    }

    private static int sumScores(List<Integer> scores) {
        int sum = 0;
        for (Integer score : scores
        ) {
            sum += score;
        }
        return sum;
    }

}
