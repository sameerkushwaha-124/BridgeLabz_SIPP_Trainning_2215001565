import java.util.Scanner;

public class VowelConsonantDetails {
    static String charType(char c) {
        c = Character.toLowerCase(c);
        if (c < 'a' || c > 'z') return "Not a Letter";
        if ("aeiou".indexOf(c) >= 0) return "Vowel";
        return "Consonant";
    }

    static String[][] analyzeString(String s) {
        String[][] res = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            res[i][0] = String.valueOf(s.charAt(i));
            res[i][1] = charType(s.charAt(i));
        }
        return res;
    }

    static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] r : arr)
            System.out.println(r[0] + "\t" + r[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        displayTable(analyzeString(input));
    }
}
