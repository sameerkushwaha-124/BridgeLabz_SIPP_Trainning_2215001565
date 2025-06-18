import java.util.*;

public class CharArrayCompare {
    static char[] getChars(String str) {
        char[] res = new char[str.length()];
        for (int i = 0; i < str.length(); i++) res[i] = str.charAt(i);
        return res;
    }

    static boolean areSame(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.next();
        char[] sys = text.toCharArray();
        char[] user = getChars(text);
        System.out.println(areSame(sys, user));
    }
}
