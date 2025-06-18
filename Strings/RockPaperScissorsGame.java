import java.util.Scanner;

public class RockPaperScissorsGame {
    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        return r == 0 ? "rock" : r == 1 ? "paper" : "scissors";
    }

    static String winner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper")))
            return "user";
        return "comp";
    }

    static String[][] calcStats(int userWins, int compWins, int draws, int total) {
        String[][] stats = new String[4][3];
        stats[0] = new String[] {"User Wins", String.valueOf(userWins), String.format("%.2f%%", userWins * 100.0 / total)};
        stats[1] = new String[] {"Comp Wins", String.valueOf(compWins), String.format("%.2f%%", compWins * 100.0 / total)};
        stats[2] = new String[] {"Draws", String.valueOf(draws), String.format("%.2f%%", draws * 100.0 / total)};
        stats[3] = new String[] {"Total Games", String.valueOf(total), "100.00%"};
        return stats;
    }

    static void displayStats(String[][] stats) {
        System.out.println("Result\tCount\tPercentage");
        for (String[] row : stats) System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int userWins = 0, compWins = 0, draws = 0;
        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + " - Enter your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            String win = winner(user, comp);
            System.out.println("Computer chose: " + comp);
            System.out.println("Result: " + win);
            if (win.equals("user")) userWins++;
            else if (win.equals("comp")) compWins++;
            else draws++;
        }
        displayStats(calcStats(userWins, compWins, draws, games));
    }
}
