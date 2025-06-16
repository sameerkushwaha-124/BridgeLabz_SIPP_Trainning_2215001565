import java.util.Scanner;
public class MultiValueUntilEnterZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();
            if (input <= 0) {
                break;
            }
            if (index < numbers.length) {
                numbers[index] = input;
                index++;
            } else {
                System.out.println("Array is full.");
                break;
            }
        }
        System.out.println("You entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.printf("Total: %.2f%n", total);
    }
}

