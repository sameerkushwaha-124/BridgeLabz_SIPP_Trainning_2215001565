import java.util.Scanner;

public class VowelConsonantCounter {
    static String charType(char c) {
        c = Character.toLowerCase(c);
        if (c < 'a' || c > 'z') return "Not a Letter";
        if ("aeiou".indexOf(c) >= 0) return "Vowel";
        return "Consonant";
    }

    static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < s.length(); i++) {
            String t = charType(s.charAt(i));
            if (t.equals("Vowel")) vowels++;
            else if (t.equals("Consonant")) consonants++;
        }
        return new int[] { vowels, consonants };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] counts = countVowelsConsonants(input);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }
}
