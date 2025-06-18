import java.util.Scanner;

public class SplitAndCompare {
    static int stringLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static String[] splitWords(String s) {
        int n = stringLength(s), spaces = 0;
        for (int i = 0; i < n; i++) if (s.charAt(i) == ' ') spaces++;
        int[] indices = new int[spaces];
        int idx = 0;
        for (int i = 0; i < n; i++) if (s.charAt(i) == ' ') indices[idx++] = i;
        String[] words = new String[spaces + 1];
        int start = 0;
        for (int i = 0; i < spaces; i++) {
            words[i] = s.substring(start, indices[i]);
            start = indices[i] + 1;
        }
        words[spaces] = s.substring(start, n);
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] splitMethod = input.split(" ");
        String[] customSplit = splitWords(input);
        System.out.println("Custom split equals built-in split? " + compareArrays(customSplit, splitMethod));
    }
}
