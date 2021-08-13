package week1.day2;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		if (text1 .length() == text2.length()) {
			char[] text1Array =text1.toCharArray();
			char[] text2Array =text2.toCharArray();
			Arrays.sort(text1Array);
			Arrays.sort(text2Array);
			boolean compResult =Arrays.equals(text1Array, text2Array);
			if (compResult) {
				System.out.println(text1 + "is an anagram of" + text2);
			}
			else
				System.out.println(text1+ "is not an anagram of" +text2);
			
		}
		
	}

}
