import java.util.*;

public class UppercaseCheck {
    static String toUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch = (char) (ch - 32);
            result += ch;
        }
        return result;
    }

    static boolean areEqual(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String sysUpper = input.toUpperCase();
        String manualUpper = toUpper(input);
        System.out.println(areEqual(sysUpper, manualUpper));
    }
}
