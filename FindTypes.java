package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
				String test = "$$ Welcome to 2nd Class of Automation $$ ";

				// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;

				// Build the logic to find the count of each
				char[] charArray = test.toCharArray();
				for (int i=0; i<test.length(); i++) {
					if (Character.isLetter(charArray[i])) {
						letter = letter+1;
					}
					else if (Character.isDigit(charArray[i])) {
						num =num+1;
					}
					else if (Character.isSpaceChar(charArray[i])) {
						space = space+1;
					}
					else 
						specialChar+=1;
				}
					
				//print the count	
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

	}

}
