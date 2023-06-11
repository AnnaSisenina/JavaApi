package Lesson3.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cube {
    int size;
    String color;
    String material;

    public Integer volumeCube() {
        Integer volume;
        volume = getSize()*getSize();

        return volume;
    }
}
