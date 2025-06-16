import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (6 to 9): ");
        int number = scanner.nextInt();

        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
            return;
        }
        int[] multiplicationResult = new int[10];
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.printf("%d * %d = %d%n", number, i + 1, multiplicationResult[i]);
        }
    }
}