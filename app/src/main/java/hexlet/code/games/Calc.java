package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static int getRandomInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static void calc() {
        String[] questions = new String[Engine.numberOfRounds];
        String[] expectedAnswers = new String[Engine.numberOfRounds];
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            int firstNumber = Engine.minNumber + (int) (Math.random() * Engine.maxNumber);
            int secondNumber = Engine.minNumber + (int) (Math.random() * Engine.maxNumber);
            int randomOperator = getRandomInt(0, 2);
            switch (randomOperator) {
                case 0 -> {
                    questions[i] = firstNumber + " + " + secondNumber;
                    expectedAnswers[i] = Integer.toString(firstNumber + secondNumber);
                }
                case 1 -> {
                    questions[i] = firstNumber + " - " + secondNumber;
                    expectedAnswers[i] = Integer.toString(firstNumber - secondNumber);
                }
                case 2 -> {
                    questions[i] = firstNumber + " * " + secondNumber;
                    expectedAnswers[i] = Integer.toString(firstNumber * secondNumber);
                }
            }
        }
        Engine.gameRules = "What is the result of the expression?";
        Engine.gameEngine(questions, expectedAnswers);
    }
}
