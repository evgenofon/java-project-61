package hexlet.code;

import hexlet.code.games.Greet;

import java.util.Scanner;
public class Engine {
    final public static int minNumber = 0;
    final public static int maxNumber = 100;
    final public static int numberOfRounds = 3;
    public static String gameRules = "";
    public static void gameEngine(String[] questions, String[] expectedAnswers) {
        Greet.greet();
        System.out.println(gameRules);
        for (int i = 0; i < numberOfRounds; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Question: " + questions[i]);
            System.out.println("Your answer: ");
            String userAnswer = scanner.next();
            if (expectedAnswers[i].equalsIgnoreCase(userAnswer)) {
                System.out.println("Correct!");
                if (i == (numberOfRounds - 1)) {
                    System.out.println("Congratulations, " + User.getUserName() + "!");
                    scanner.close();
                }
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + expectedAnswers[i] + "'.");
                System.out.println("Let's try again " + User.getUserName() + "!");
                scanner.close();
                i = numberOfRounds;
            }
        }
    }

}
