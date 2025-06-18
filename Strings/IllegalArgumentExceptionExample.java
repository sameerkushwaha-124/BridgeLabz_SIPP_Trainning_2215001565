import java.util.Scanner;

public class IllegalArgumentExceptionExample {
    public static void generateException(String str){
        String substring = str.substring(5,2);
        System.out.println(substring);
    }
    public static void HandleException(String str){
        try{
            String substring = str.substring(5,2);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // generateException(str);

        HandleException(str);
    }
}
