package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void even() {
        String[] questions = new String[Engine.ROUNDS];
        String[] expectedAnswers = new String[Engine.ROUNDS];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = Engine.MIN + (int) (Math.random() * Engine.MAX);
            boolean evenNumber = ((randomNumber % 2) == 0);
            questions[i] = Integer.toString(randomNumber);
            if (evenNumber) {
                expectedAnswers[i] = "yes";
            } else {
                expectedAnswers[i] = "no";
            }
        }
        Engine.gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.gameEngine(questions, expectedAnswers);
    }
}
