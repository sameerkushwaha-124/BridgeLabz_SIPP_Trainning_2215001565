import java.util.Scanner;

public class StringTrimmer {
    static int[] findTrimIndices(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[] { start, end };
    }

    static String substring(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(s.charAt(i));
        return sb.toString();
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] idx = findTrimIndices(input);
        String trimmedCustom = idx[0] <= idx[1] ? substring(input, idx[0], idx[1]) : "";
        String trimmedBuiltIn = input.trim();
        System.out.println("Custom trim: [" + trimmedCustom + "]");
        System.out.println("Built-in trim: [" + trimmedBuiltIn + "]");
        System.out.println("Equal? " + compareStrings(trimmedCustom, trimmedBuiltIn));
    }
}
