package edu.hw3.Task2;

import java.util.ArrayList;
import java.util.Stack;

public class Cluster {
    private Cluster() {

    }

    public static ArrayList<String> clusterize(String string) {
        ArrayList<String> clasters = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        int first = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    if (stack.isEmpty()) {
                        clasters.add(string.substring(first, i + 1));
                        first = i + 1;
                    }
                } else {
                    stack.clear();
                    first = i + 1;
                }
            }
        }
        return clasters;
    }
}
