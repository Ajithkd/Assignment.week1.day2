package week1.day2;

public class PrintDuplicateInArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		boolean duplicate;
		for (int i=0; i<arr.length; i++) {
			duplicate = false;
			for (int j=i+1; j<arr.length; j++) {
				//System.out.println(j);
				if (arr[i] == arr[j]) {
					duplicate=true;
					//System.out.println(arr[i]);
										
				}
				
			}
		if (duplicate) {
			System.out.println("Element "+arr[i]+" is duplicate");
		}
		}
		
		
	}

}









