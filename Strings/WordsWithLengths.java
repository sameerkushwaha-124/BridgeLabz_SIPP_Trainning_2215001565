import java.util.Scanner;

public class WordsWithLengths {
    static String[] splitWords(String s) {
        int n = s.length(), count = 1;
        for (int i = 0; i < n; i++) if (s.charAt(i) == ' ') count++;
        String[] words = new String[count];
        int idx = 0, start = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                words[idx++] = s.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = s.substring(start, n);
        return words;
    }

    static int stringLength(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (Exception e) {}
        return len;
    }

    static String[][] wordLengthPairs(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(stringLength(words[i]));
        }
        return res;
    }

    static void displayTable(String[][] arr) {
        System.out.println("Word\tLength");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] pairs = wordLengthPairs(words);
        displayTable(pairs);
    }
}
