import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();
            while (weight[i] <= 0) {
                System.out.print("Invalid! Enter positive weight: ");
                weight[i] = sc.nextDouble();
            }

            System.out.print("Enter height (m): ");
            height[i] = sc.nextDouble();
            while (height[i] <= 0) {
                System.out.print("Invalid! Enter positive height: ");
                height[i] = sc.nextDouble();
            }

            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d:\n", (i + 1));
            System.out.printf("  Weight: %.2f kg\n", weight[i]);
            System.out.printf("  Height: %.2f m\n", height[i]);
            System.out.printf("  BMI: %.2f\n", bmi[i]);
            System.out.println("  Status: " + status[i]);
            System.out.println();
        }
    }
}
