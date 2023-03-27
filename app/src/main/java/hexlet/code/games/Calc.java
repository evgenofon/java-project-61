package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void calc() {
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Engine.getRandomInt(Engine.MIN, Engine.MAX);
            int secondNumber = Engine.getRandomInt(Engine.MIN, Engine.MAX);
            int randomOperator = Engine.getRandomInt(0, 2);
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
