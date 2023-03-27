package hexlet.code;

import hexlet.code.games.Greet;

import java.util.Scanner;
public class Engine {
    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int ROUNDS = 3;
    public static String gameRules = "";
    public static void gameEngine(String[] questions, String[] expectedAnswers) {
        Greet.greet();
        System.out.println(gameRules);
        for (int i = 0; i < ROUNDS; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Question: " + questions[i]);
            System.out.println("Your answer: ");
            String userAnswer = scanner.next();
            if (expectedAnswers[i].equalsIgnoreCase(userAnswer)) {
                System.out.println("Correct!");
                if (i == (ROUNDS - 1)) {
                    System.out.println("Congratulations, " + User.getUserName() + "!");
                    scanner.close();
                }
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '" + expectedAnswers[i] + "'.");
                System.out.println("Let's try again " + User.getUserName() + "!");
                scanner.close();
                i = ROUNDS;
            }
        }
    }

}
