import java.util.*;

public class StringIndexDemo {
    static void throwException(String text) {
        char c = text.charAt(text.length());
        System.out.println(c);
    }

    static void handleException(String text) {
        try {
            char c = text.charAt(text.length());
            System.out.println(c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index error");
        } catch (RuntimeException e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        // throwException(input);
        handleException(input);
    }
}
