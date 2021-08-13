
package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "madam";
		String reverse ="";
		for (int i=original.length()-1; i>=0; i--) {
			reverse=reverse+original.charAt(i);
		}
		if (original.equals(reverse)) {
			System.out.println(original+" is a palindrome");
		}
		else
			System.out.println(original+" is not a palindrome");

	}

}




