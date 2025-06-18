import java.util.Random;

public class ScoreCard {
    static int[][] genScores(int n) {
        Random r = new Random();
        int[][] sc = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                sc[i][j] = 10 + r.nextInt(90);
        return sc;
    }

    static double[][] calcStats(int[][] sc) {
        int n = sc.length;
        double[][] stats = new double[n][3];
        for (int i = 0; i < n; i++) {
            int tot = sc[i][0] + sc[i][1] + sc[i][2];
            double avg = tot / 3.0;
            double per = (tot / 300.0) * 100;
            stats[i][0] = Math.round(tot * 100) / 100.0;
            stats[i][1] = Math.round(avg * 100) / 100.0;
            stats[i][2] = Math.round(per * 100) / 100.0;
        }
        return stats;
    }

    static String[] genGrades(double[][] stats) {
        int n = stats.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double p = stats[i][2];
            if (p >= 90) grades[i] = "A+";
            else if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    static void show(int[][] sc, double[][] stats, String[] grades) {
        System.out.printf("%-7s %-7s %-9s %-7s %-7s %-8s %-8s %-7s\n",
                "Stud", "Phys", "Chem", "Maths", "Total", "Avg", "Percent", "Grade");
        for (int i = 0; i < sc.length; i++) {
            System.out.printf("%-7d %-7d %-9d %-7d %-7.0f %-8.2f %-8.2f %-7s\n",
                    i + 1, sc[i][0], sc[i][1], sc[i][2], stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] scores = genScores(n);
        double[][] stats = calcStats(scores);
        String[] grades = genGrades(stats);
        show(scores, stats, grades);
    }
}
