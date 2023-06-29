package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static void gcd() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.getRandomInt(Engine.MIN, Engine.MAX);
            int secondNumber = Utils.getRandomInt(Engine.MIN, Engine.MAX);
            questionsAndAnswers[i][0] = firstNumber + " " + secondNumber;
            questionsAndAnswers[i][1] = Integer.toString(Utils.gcdByEuclidesAlgorithm(firstNumber, secondNumber));
        }
        Engine.gameEngine(DESCRIPTION, questionsAndAnswers);
    }
}
