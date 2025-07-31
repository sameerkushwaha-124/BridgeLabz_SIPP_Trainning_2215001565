import java.util.Scanner;

public class Palindrome {
	    String text;
	    Palindrome(String text) {
	        this.text = text;
	    }
	    boolean isPalindrome() {
	        String reversed = new StringBuilder(text).reverse().toString();
	        return text.equalsIgnoreCase(reversed);
	    }
	    void displayAnswer() {
	        if (isPalindrome()) {
	            System.out.println(text + " is a palindrome.");
	        } else {
	            System.out.println(text + " is not a palindrome.");
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        Palindrome Palin= new Palindrome(input);
	        Palin.displayAnswer();
	    }
	}