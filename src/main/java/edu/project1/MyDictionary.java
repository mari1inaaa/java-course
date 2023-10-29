package edu.project1;

import org.jetbrains.annotations.NotNull;
import java.util.Random;

interface Dictionary {
    @NotNull String randomWord();
}

public class MyDictionary implements Dictionary {
    private String[] words;

    MyDictionary(String[] words) {
        this.words = words;
    }

    @Override
    public String randomWord() {
        int random = new Random().nextInt(words.length);
        return words[random];
    }
}
