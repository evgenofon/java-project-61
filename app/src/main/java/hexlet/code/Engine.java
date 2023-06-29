package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int ROUNDS = 3;
    public static void gameEngine(String description, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have Your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.println("Your answer: ");
            String userAnswer = scanner.next();
            if (questionsAndAnswers[i][1].equalsIgnoreCase(userAnswer)) {
                System.out.println("Correct!");
                if (i == (ROUNDS - 1)) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '" + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again " + userName + "!");
                i = ROUNDS;
            }
        }
        scanner.close();
    }

}
