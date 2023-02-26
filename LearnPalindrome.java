package day7;

public class LearnPalindrome {
	public static void main(String[] args) {
		//declare a string
		String name = "madam";
		//convert the string into character
		char[] a = name.toCharArray();
		//declare empty string
		String rev = "";
		//iterate the for loop
		for (int i=a.length-1; i>=0;i--) {
			rev=rev+a[i];
		}
		//give if input statement 
		if (name.equals(rev)) {
			System.out.println("the given String is palindrome");
		}
		//give  else input statement
		else
			System.out.println("the given String is not palindrome");
	}

}
