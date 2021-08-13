package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		String test = "I am a software tester"; 
		String[] stringArray = test.split(" ");
		String reverseEvenWordsString = "";
		for (int i=0; i<stringArray.length; i++) {
			if ((i+1)%2==0) {
				String reverse = "";
				for (int j=stringArray[i].length()-1; j>=0; j--) {
					reverse = reverse + stringArray[i].charAt(j);
				}
				reverseEvenWordsString = reverseEvenWordsString+reverse;
			}
			else {
				reverseEvenWordsString = reverseEvenWordsString+stringArray[i];
			}
			reverseEvenWordsString = reverseEvenWordsString + " ";
		}
		System.out.println("Even words reversed string is : "+reverseEvenWordsString);

	}

}









