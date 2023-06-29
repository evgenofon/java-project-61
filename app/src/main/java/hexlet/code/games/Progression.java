package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    public static final String DESCRIPTION = "What number is missing in the progression?";
    public static void progression() {
        String[][] questionsAndAnswers = new String[Engine.ROUNDS][2];
        for (int i = 0; i < Engine.ROUNDS; i++) {
            final int minArrayLength = 5;
            final int maxArrayLength = 10;
            int arrayLength = Utils.getRandomInt(minArrayLength, maxArrayLength);
            String[] numbers = new String[arrayLength];
            int randomFirstNumber = Utils.getRandomInt(Engine.MIN, Engine.MAX);
            int randomTerm = Utils.getRandomInt(Engine.MIN, Engine.MAX);
            for (var j = 0; j < arrayLength; j++) {
                numbers[j] = Integer.toString(randomFirstNumber + (randomTerm * j));
            }
            int randomBlankSpot = Utils.getRandomInt(0, (arrayLength - 1));
            questionsAndAnswers[i][1] = numbers[randomBlankSpot];
            numbers[randomBlankSpot] = "..";
            questionsAndAnswers[i][0] = Arrays.toString(numbers);
        }
        Engine.gameEngine(DESCRIPTION, questionsAndAnswers);
    }
}
