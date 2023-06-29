package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void even() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = Utils.getRandomInt(Engine.MIN, Engine.MAX);
            boolean evenNumber = ((randomNumber % 2) == 0);
            questionsAndAnswers[i][0] = Integer.toString(randomNumber);
            questionsAndAnswers[i][1] = evenNumber ? "yes" : "no";
        }
        Engine.gameEngine(DESCRIPTION, questionsAndAnswers);
    }
}
