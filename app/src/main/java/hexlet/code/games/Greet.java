package hexlet.code.games;

import java.util.Scanner;

public class Greet {
    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have Your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        scanner.close();
    }
}
