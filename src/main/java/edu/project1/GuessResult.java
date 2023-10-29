package edu.project1;

import org.jetbrains.annotations.NotNull;

sealed interface GuessResult {
    char[] state();

    int attempt();

    int maxAttempts();

    @NotNull String message();

    record Defeat(String answer, char[] userAnswer, int attempt, int maxAttempts) implements GuessResult {
        @Override
        public char[] state() {
            return userAnswer;
        }

        @Override
        public int attempt() {
            return attempt;
        }

        @Override
        public int maxAttempts() {
            return maxAttempts;
        }

        @Override
        public String message() {
            return "You lost. Correct answer: " + answer;
        }
    }

    record Win(String answer, char[] userAnswer, int attempt, int maxAttempts) implements GuessResult {
        @Override
        public char[] state() {
            return userAnswer;
        }

        @Override
        public int attempt() {
            return attempt;
        }

        @Override
        public int maxAttempts() {
            return maxAttempts;
        }

        @Override
        public String message() {
            return "You won. Correct answer: " + answer;
        }
    }

    record SuccessfulGuess(char[] state, int attempt, int maxAttempts) implements GuessResult {
        @Override
        public char[] state() {
            return state;
        }

        @Override
        public int attempt() {
            return attempt;
        }

        @Override
        public int maxAttempts() {
            return maxAttempts;
        }

        @Override
        public String message() {
            return "You're right!\n" + "The word" + String.valueOf(state);
        }
    }

    record FailedGuess(char[] state, int attempt, int maxAttempts) implements GuessResult {
        @Override
        public char[] state() {
            return state;
        }

        @Override
        public int attempt() {
            return attempt + 1;
        }

        @Override
        public int maxAttempts() {
            return maxAttempts;
        }

        @Override
        public String message() {
            return "You're wrong!\nMistake " + attempt() + " out of " + maxAttempts() + "\nThe word" +
                String.valueOf(state);
        }
    }
}
