import java.util.Scanner;

public class VotingAgeChecker {
    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) ages[i] = (int)(Math.random() * 90) + 10;
        return ages;
    }

    static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            result[i][1] = (age >= 18 && age >= 0) ? "true" : "false";
        }
        return result;
    }

    static void displayResults(String[][] data) {
        System.out.println("Age\tCan Vote");
        for (String[] row : data) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        displayResults(checkVotingEligibility(ages));
    }
}
