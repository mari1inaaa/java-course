package edu.hw2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import edu.hw2.Task4.*;

public class Test4 {
    @Test
    void callingInfo() {
        CallingInfo callingInfo = Task4.callingInfo();
        assertThat(callingInfo.className()).isEqualTo("edu.hw2.Test4");
        assertThat(callingInfo.methodName()).isEqualTo("callingInfo");
    }
}
