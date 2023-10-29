package edu.hw3.Task2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;

public class TestCluster {
    @Test
    void correctBrackets() {
        String brackets = "((()))(())()()(()())";
        ArrayList<String> result = Cluster.clusterize(brackets);
        assertThat(result).containsExactly("((()))", "(())", "()", "()", "(()())");
    }

    @Test
    void unbalancedBrackets() {
        String brackets = "()))(())()()(()())";
        ArrayList<String> result = Cluster.clusterize(brackets);
        assertThat(result).containsExactly("()", "(())", "()", "()", "(()())");

    }
}
