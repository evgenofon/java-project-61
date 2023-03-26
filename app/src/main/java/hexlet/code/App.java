package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        int gameChoice = scanner.nextInt();
        switch (gameChoice) {
            case 0 -> scanner.close();
            case 1 -> {
                Greet.greet();
                scanner.close();
            }
            case 2 -> Even.even();
            default -> scanner.close();
        }

    }
}
