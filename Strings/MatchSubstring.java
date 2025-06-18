import java.util.Scanner;

public class MatchSubstring{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        String subst1 = findSubString(str, start, end);

        String subst2 = str.substring(start, end+1);
        System.out.println(subst1.equals(subst2));

    }
    public static String findSubString(String str, int start, int end){
        String ans = "";
        for(int i = start; i <= end; i++){
            ans += str.charAt(i);
        }
        return ans;
    }
}