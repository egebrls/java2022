package reCapDemo_Classes;

public class FourEquations {
	public int Add(int number1, int number2) {		
		return number1 + number2;
	}
	
	public int Subtract(int number1, int number2) {		
		return number1 - number2;
	}
	
	public int Multiply(int number1, int number2) {		
		return number1 * number2;
	}
	
	public int Divide(int number1, int number2) {	
		
		if(number2 == 0) {
			System.out.println("Divider cannot be zero.");
			return 0;
		}
		else {
		return number1 / number2;
		}
	}
}
