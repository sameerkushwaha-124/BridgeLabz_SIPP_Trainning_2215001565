import java.util.Scanner;

public class StringLengthFinder {
    static int findLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println("Length by method: " + findLength(input));
        System.out.println("Length by built-in: " + input.length());
    }
}
