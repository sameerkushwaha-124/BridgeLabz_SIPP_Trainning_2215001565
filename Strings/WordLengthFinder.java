import java.util.Scanner;

public class WordLengthFinder {
    static String[] splitTextToWords(String text) {
        int len = text.length(), wordCount = 1;
        for (int i = 0; i < len; i++) if (text.charAt(i) == ' ') wordCount++;
        String[] words = new String[wordCount];
        int start = 0, idx = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[idx++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[idx] = text.substring(start, len);
        return words;
    }

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

    static String[][] mapWordsToLength(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(stringLength(words[i]));
        }
        return res;
    }

    static int[] findShortestLongest(String[][] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minIdx = 0, maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < min) { min = len; minIdx = i; }
            if (len > max) { max = len; maxIdx = i; }
        }
        return new int[] { minIdx, maxIdx };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitTextToWords(text);
        String[][] wordLen = mapWordsToLength(words);
        int[] shortestLongestIdx = findShortestLongest(wordLen);
        System.out.println("Shortest word: " + wordLen[shortestLongestIdx[0]][0]);
        System.out.println("Longest word: " + wordLen[shortestLongestIdx[1]][0]);
    }
}
