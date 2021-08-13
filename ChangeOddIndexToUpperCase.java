package week1.day2;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		String input = "changeme";
		String output ="";
		char[] charArray = input.toCharArray();	
		for (int i=0; i<charArray.length; i++) {
			if (i%2==1) {
				output = output+Character.toUpperCase(charArray[i]);
			}
			else
				output = output+charArray[i];
		}
		System.out.println("Array is"+output);
		}

	}
