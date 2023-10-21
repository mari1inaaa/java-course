package edu.hw2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import edu.hw2.Task2.*;
public class Test2 {
    @Test
    void rectangleArea() {
        Rectangle rectangle = new Rectangle(30, 15);
        assertThat(rectangle.area()).isEqualTo(450);
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        assertThat(rectangle.area()).isEqualTo(600);
    }
    @Test
    void squareArea() {
        Square square = new Square(15);
        assertThat(square.area()).isEqualTo(225);
        square.setWidth(20);
        assertThat(square.area()).isEqualTo(400);
    }
}
