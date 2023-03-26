package hexlet.code;

import java.util.Scanner;
public final class User {
    private static String userName;
    public static void setUserName() {
        Scanner scanner = new Scanner(System.in);
        userName = scanner.next();
    }
    public static String getUserName() {
        return userName;
    }
}
