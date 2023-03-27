package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void prime() {
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int randomNumber = Engine.getRandomInt(Engine.MIN, Engine.MAX);
            boolean flag = false;
            for (int j = 2; j <= randomNumber / 2; ++j) {
                if (randomNumber % j == 0) {
                    flag = true;
                    break;
                }
            }
            Engine.questions[i] = Integer.toString(randomNumber);

            if (!flag) {
                Engine.expectedAnswers[i] = "yes";
            }  else {
                Engine.expectedAnswers[i] = "No";
            }
        }
        Engine.gameRules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.gameEngine(Engine.questions, Engine.expectedAnswers);
    }
}
