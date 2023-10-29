package edu.project1;

import java.util.Scanner;

class ConsoleHangman {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "juice", "banana", "duck"};
        Dictionary dictionary = new MyDictionary(words);
        String answer = dictionary.randomWord();
        char[] userAnswer = new char[answer.length()];
        int maxAttempts = 6;
        int attempts = 0;
        Session session = new Session(answer, userAnswer, maxAttempts, attempts);
        while (true) {
            System.out.print("Enter a letter: ");
            String input = scanner.next();
            if (input.length() != 1) {
                System.out.println("Please enter a single letter.");
                continue;
            }
            char guess = input.charAt(0);

            session.guess(guess);
            if (session.guess(guess) instanceof GuessResult.Defeat ||
                session.guess(guess) instanceof GuessResult.Win) {
                break;
            }

        }
        scanner.close();
    }

//    private GuessResult tryGuess(Session session, String input) {
//    }
//
//    private void printState(GuessResult guess) {
//
//    }
}
