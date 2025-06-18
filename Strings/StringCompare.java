import java.util.*;

public class StringCompare {
    static boolean match(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next(), b = s.next();
        boolean custom = match(a, b);
        boolean builtin = a.equals(b);
        System.out.println(custom == builtin);
    }
}
