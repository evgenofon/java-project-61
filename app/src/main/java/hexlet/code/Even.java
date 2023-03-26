package hexlet.code;

import java.util.Scanner;
public class Even {
    public static void even() {
        Scanner scanner = new Scanner(System.in);

        final int minNumber = 0;
        final int maxNumber = 1000;
        Greet.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int numberOfRounds = 3;
        for (int i = 0; i < numberOfRounds; i++) {
            int randomNumber = minNumber + (int) (Math.random() * maxNumber);
            System.out.println("Question: " + randomNumber);
            System.out.println("Your answer: ");
            String userAnswer = scanner.next();
            boolean evenNumber = ((randomNumber % 2) == 0);
            boolean oddNumber = ((randomNumber % 2) == 1);
            boolean answerYes = userAnswer.equalsIgnoreCase("yes");
            boolean answerNo = userAnswer.equalsIgnoreCase("no");
            if ((evenNumber && answerYes) || oddNumber && answerNo) {
                System.out.println("Correct!");
                if (i == (numberOfRounds - 1)) {
                    System.out.println("Congratulations, " + User.getUserName() + "!");
                    scanner.close();
                }
            } else {
                if (answerYes) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again " + User.getUserName() + "!");
                    scanner.close();
                    i = numberOfRounds;
                } else if (answerNo) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again " + User.getUserName() + "!");
                    scanner.close();
                    i = numberOfRounds;
                } else {
                    System.out.println("Let's try again " + User.getUserName() + "!");
                    scanner.close();
                    i = numberOfRounds;
                }
            }
        }
    }
}
