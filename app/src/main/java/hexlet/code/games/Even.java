package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void even() {
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = Engine.getRandomInt(Engine.MIN, Engine.MAX);
            boolean evenNumber = ((randomNumber % 2) == 0);
            Engine.questions[i] = Integer.toString(randomNumber);
            if (evenNumber) {
                Engine.expectedAnswers[i] = "yes";
            } else {
                Engine.expectedAnswers[i] = "no";
            }
        }
        Engine.gameRules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.gameEngine(Engine.questions, Engine.expectedAnswers);
    }
}
