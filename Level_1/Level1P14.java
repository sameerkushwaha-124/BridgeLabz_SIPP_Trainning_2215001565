import java.util.Scanner;
public class Level1P14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760; 
        System.out.printf("The distance in yards is %.2f and in miles is %.2f%n", distanceInYards, distanceInMiles);
    }
}
