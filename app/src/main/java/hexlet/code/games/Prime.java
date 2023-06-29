package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void prime() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = Utils.getRandomInt(Engine.MIN, Engine.MAX);
            boolean flag = false;
            for (int j = 2; j <= randomNumber / 2; ++j) {
                if (randomNumber % j == 0) {
                    flag = true;
                    break;
                }
            }
            questionsAndAnswers[i][0] = Integer.toString(randomNumber);

            if (!flag) {
                questionsAndAnswers[i][1] = "yes";
            }  else {
                questionsAndAnswers[i][1] = "No";
            }
        }
        Engine.gameEngine(DESCRIPTION, questionsAndAnswers);
    }
}
