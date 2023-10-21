package edu.hw2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test1 {
    @Test
    void basicTest(){
        var two = new Task1.Constant(2);
        var four = new Task1.Constant(4);
        var negOne = new Task1.Negate(new Task1.Constant(1));
        var sumTwoFour = new Task1.Addition(two, four);
        var mult = new Task1.Multiplication(sumTwoFour, negOne);
        var exp = new Task1.Exponent(mult, 2);
        var res = new Task1.Addition(exp, new Task1.Constant(1));
        assertThat(res.evaluate()).isEqualTo(37.0);
    }
}
