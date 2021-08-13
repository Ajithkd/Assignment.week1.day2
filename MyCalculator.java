package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating instance of Calculator object
		Calculator objCalc = new Calculator();
		
		//Calling add method 
		int additionValue = objCalc.add(150, 180,220);
		System.out.println("Sum of the numbers is : "+additionValue);
		
		//Calling sub method
		int subtractionValue = objCalc.sub(85, 54);
		System.out.println("Subtraction value is : "+subtractionValue);
		
		//Calling multiplication method
		double mulValue = objCalc.mul(52.5678, 54.6784);
		System.out.println("Product of two numbers is : "+mulValue);
		
		//Calling Division method
		float divValue = objCalc.divide(73.20f,56.80f);
		System.out.println("Division of two numbers is : "+divValue);

	}

}