package hexlet.code;

public class Even {
    public static void even() {
        String[] questions = new String[Engine.numberOfRounds];
        String[] expectedAnswers = new String[Engine.numberOfRounds];
        for (int i = 0; i < Engine.numberOfRounds; i++) {
            int randomNumber = Engine.minNumber + (int) (Math.random() * Engine.maxNumber);
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
