package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static final String DESCRIPTION = "What is the result of the expression?";
    public static void calc() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.getRandomInt(Engine.MIN, Engine.MAX);
            int secondNumber = Utils.getRandomInt(Engine.MIN, Engine.MAX);
            int randomOperator = Utils.getRandomInt(0, 2);
            switch (randomOperator) {
                case 0 -> {
                    questionsAndAnswers[i][0] = firstNumber + " + " + secondNumber;
                    questionsAndAnswers[i][1] = Integer.toString(firstNumber + secondNumber);
                }
                case 1 -> {
                    questionsAndAnswers[i][0] = firstNumber + " - " + secondNumber;
                    questionsAndAnswers[i][1] = Integer.toString(firstNumber - secondNumber);
                }
                case 2 -> {
                    questionsAndAnswers[i][0] = firstNumber + " * " + secondNumber;
                    questionsAndAnswers[i][1] = Integer.toString(firstNumber * secondNumber);
                }
                default -> {
                    throw new RuntimeException("Unknown input");
                }
            }
        }
        Engine.gameEngine(DESCRIPTION, questionsAndAnswers);
    }
}
