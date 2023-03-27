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
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Engine.getRandomInt(Engine.MIN, Engine.MAX);
            int secondNumber = Engine.getRandomInt(Engine.MIN, Engine.MAX);
            Engine.questions[i] = firstNumber + " " + secondNumber;
            Engine.expectedAnswers[i] = Integer.toString(gcdByEuclidesAlgorithm(firstNumber, secondNumber));
        }
        Engine.gameRules = "Find the greatest common divisor of given numbers.";
        Engine.gameEngine(Engine.questions, Engine.expectedAnswers);
    }
}
