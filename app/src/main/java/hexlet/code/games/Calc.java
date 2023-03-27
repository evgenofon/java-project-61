package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static int getRandomInt(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static void calc() {
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Engine.MIN + (int) (Math.random() * Engine.MAX);
            int secondNumber = Engine.MIN + (int) (Math.random() * Engine.MAX);
            int randomOperator = getRandomInt(0, 2);
            switch (randomOperator) {
                case 1 -> {
                    Engine.questions[i] = firstNumber + " - " + secondNumber;
                    Engine.expectedAnswers[i] = Integer.toString(firstNumber - secondNumber);
                }
                case 2 -> {
                    Engine.questions[i] = firstNumber + " * " + secondNumber;
                    Engine.expectedAnswers[i] = Integer.toString(firstNumber * secondNumber);
                }
                default -> {
                    Engine.questions[i] = firstNumber + " + " + secondNumber;
                    Engine.expectedAnswers[i] = Integer.toString(firstNumber + secondNumber);
                }
            }
        }
        Engine.gameRules = "What is the result of the expression?";
        Engine.gameEngine(Engine.questions, Engine.expectedAnswers);
    }
}
