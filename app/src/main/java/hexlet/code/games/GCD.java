package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static int gcdByEuclidesAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidesAlgorithm(n2, n1 % n2);
    }
    public static void gcd() {
        String[] questions = new String[Engine.ROUNDS];
        String[] expectedAnswers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Engine.MIN + (int) (Math.random() * Engine.MAX);
            int secondNumber = Engine.MIN + (int) (Math.random() * Engine.MAX);
            questions[i] = firstNumber + " " + secondNumber;
            expectedAnswers[i] = Integer.toString(gcdByEuclidesAlgorithm(firstNumber, secondNumber));
        }
        Engine.gameRules = "Find the greatest common divisor of given numbers.";
        Engine.gameEngine(questions, expectedAnswers);
    }
}
