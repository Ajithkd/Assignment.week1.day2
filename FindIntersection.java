package week1.day2;

public class FindIntersection {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	// Declare an Array for {3,2,11,4,6,7}
	int[] arrayone = {3,2,11,4,6,7};
	// Declare another array for {1,2,8,4,9,7}
	
	int[ ]arraytwo = {1,2,8,4,9,7};
	for (int i=0; i<arrayone.length; i++) {
		for (int j=0; j<arraytwo.length; j++) {
			if (arrayone[i]==arraytwo[j]) {
				System.out.println("Element"+arrayone[i]+" is present in both the arrays");
			}
		}
	}
}
}
