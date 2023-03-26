package hexlet.code;

public class Greet {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have Your name? ");
        User.setUserName();
        System.out.println("Hello, " + User.getUserName() + "!");
    }
}
