import java.util.*;
public class TwoDTo1D{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[][] = new int[size][size];

        // Taking Input From User
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // 2D To 1D
        int k = 0;
        int nums[] = new int[size*size];
         for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                nums[k++] = arr[i][j];
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}