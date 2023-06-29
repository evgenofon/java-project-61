package hexlet.code;

public class Utils {
    public static int getRandomInt(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static int gcdByEuclidesAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidesAlgorithm(n2, n1 % n2);
    }
}
