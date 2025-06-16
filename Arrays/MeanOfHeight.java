import java.util.Scanner;

public class MeanOfHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = 11;
        double height[] = new double[11];

        System.out.println("Enter the height of the 11 players : ");
        for(int i = 0; i < n; i++){
            height[i] = sc.nextDouble();
        }

        double sum = 0;
        for(int i = 0 ; i  <  n; i++){
            sum += height[i];
        }
        System.out.println("Avg of 11 Players : " + sum / 11);
    }
    
}
