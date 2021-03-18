package Golac.Mirna.Chapter7.Java.Project;

public class SimpleMath {
	public double divide(double numerator, double denominator) {
		if(denominator == 0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		
		double result = numerator/denominator;
		System.out.println(result);
		
		return result;
	}
	
	double multiply(double number1, double number2) {
		return number1*number2;
	}
}
