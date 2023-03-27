package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {
    public static void progression() {
        for (int i = 0; i < Engine.ROUNDS; i++) {
            final int minArrayLength = 5;
            final int maxArrayLength = 10;
            int arrayLength = Engine.getRandomInt(minArrayLength, maxArrayLength);
            String[] numbers = new String[arrayLength];
            int randomFirstNumber = Engine.getRandomInt(Engine.MIN, Engine.MAX);
            int randomTerm = Engine.getRandomInt(Engine.MIN, Engine.MAX);
            for (var j = 0; j < arrayLength; j++) {
                numbers[j] = Integer.toString(randomFirstNumber + (randomTerm * j));
            }
            int randomBlankSpot = Engine.getRandomInt(0, (arrayLength - 1));
            Engine.expectedAnswers[i] = numbers[randomBlankSpot];
            numbers[randomBlankSpot] = "..";
            Engine.questions[i] = Arrays.toString(numbers);
        }
        Engine.gameRules = "What number is missing in the progression?";
        Engine.gameEngine(Engine.questions, Engine.expectedAnswers);
    }
}
