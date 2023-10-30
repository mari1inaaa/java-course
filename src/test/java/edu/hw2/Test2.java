package edu.hw2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import edu.hw2.Task2.*;

public class Test2 {
    @Test
    void rectangleArea() {
        Rectangle rectangle = new Rectangle(0, 0);
        //assertThat(rectangle.area()).isEqualTo(450);
        rectangle.setHeight(20);
        rectangle.setWidth(30);
        assertThat(rectangle.area()).isEqualTo(600);
    }

    @Test
    void squareArea() {
        Square square = new Square(0);
        //assertThat(square.area()).isEqualTo(225);
        square.setWidth(20);
        square.setHeight(20);
        assertThat(square.area()).isEqualTo(400);
    }

    private boolean isLSP(Rectangle rectangle) {
        rectangle.setHeight(10);
        rectangle.setWidth(20);
        return rectangle.area() == 200;
    }

    @Test
    void isLSP() {
        // Rectangle rectangle = new Rectangle(15, 20);
        assertThat(isLSP(new Square(0))).isEqualTo(true);
    }
}
