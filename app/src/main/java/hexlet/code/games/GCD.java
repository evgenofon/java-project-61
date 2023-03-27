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
        String[] questions = new String[Engine.numberOfRounds];
        String[] expectedAnswers = new String[Engine.numberOfRounds];
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            int firstNumber = Engine.minNumber + (int) (Math.random() * Engine.maxNumber);
            int secondNumber = Engine.minNumber + (int) (Math.random() * Engine.maxNumber);
            questions[i] = firstNumber + " " + secondNumber;
            expectedAnswers[i] = Integer.toString(gcdByEuclidesAlgorithm(firstNumber, secondNumber));
        }
        Engine.gameRules = "Find the greatest common divisor of given numbers.";
        Engine.gameEngine(questions, expectedAnswers);
    }
}
