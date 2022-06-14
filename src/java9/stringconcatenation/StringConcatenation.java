package java9.stringconcatenation;

public class StringConcatenation {
    public static void main(String[] args) {
        logger("Changes in JDK 9",23);
    }

    private static void logger(String message, int count) {
        System.out.println("[" + System.currentTimeMillis() + "]"
                + " : " + message + " (" + count+ ")");
    }
}
