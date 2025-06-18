import java.util.*;

public class ArrayIndexDemo {
    static void throwException(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index error");
        } catch (RuntimeException e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) names[i] = s.next();
        // throwException(names);
        handleException(names);
    }
}
