package edu.project1;

import org.jetbrains.annotations.NotNull;
import java.util.Arrays;

class Session {
    private final String answer;
    private final char[] userAnswer;
    private final int maxAttempts;
    private int attempts;

    Session(String answer, char[] userAnswer, int maxAttempts, int attempts) {
        this.answer = answer;
        this.userAnswer = userAnswer;
        this.maxAttempts = maxAttempts;
        this.attempts = attempts;
    }

    public boolean containsChar(char[] charArray, char targetChar) {
        for (char c : charArray) {
            if (c == targetChar) {
                return true;
            }
        }
        return false;
    }

    @NotNull GuessResult guess(char guess) {
        if (attempts >= maxAttempts) {
            return new GuessResult.Defeat(answer, userAnswer, attempts, maxAttempts);
        }
        if (Arrays.equals(userAnswer, answer.toCharArray())) {
            return new GuessResult.Win(answer, userAnswer, attempts, maxAttempts);
        }

        if (answer.contains(String.valueOf(guess)) & !containsChar(userAnswer, guess)) {
            char[] newState = userAnswer.clone();
            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == guess) {
                    newState[i] = guess;
                }
            }
            return new GuessResult.SuccessfulGuess(newState, attempts, maxAttempts);
        } else {
            return new GuessResult.FailedGuess(userAnswer, attempts, maxAttempts);
        }
    }

    @NotNull GuessResult giveUp() {
        return new GuessResult.Defeat(answer, userAnswer, attempts, maxAttempts);
    }
}
