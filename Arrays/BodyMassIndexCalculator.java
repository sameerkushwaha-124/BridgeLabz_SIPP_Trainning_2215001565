import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.print("Enter positive weight: ");
                weight = sc.nextDouble();
            }
            System.out.print("Enter height (cm): ");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.out.print("Enter positive height: ");
                height = sc.nextDouble();
            }
            double heightInM = height / 100;
            double bmi = weight / (heightInM * heightInM);
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;
            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\nResult:");
        System.out.println("Weight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n",
                personData[i][0],
                personData[i][1],
                personData[i][2],
                status[i]);
        }
    }
}
