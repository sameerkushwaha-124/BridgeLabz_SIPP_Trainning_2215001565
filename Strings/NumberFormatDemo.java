import java.util.*;

public class NumberFormatDemo {
    static void throwException(String val) {
        int num = Integer.parseInt(val);
        System.out.println(num);
    }

    static void handleException(String val) {
        try {
            int num = Integer.parseInt(val);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        } catch (RuntimeException e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String val = s.next();
        // throwException(val);
        handleException(val);
    }
}
