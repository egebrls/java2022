package reCapDemo_Classes;

public class Main {
	public static void main(String[] args) {
		FourEquations fourEquations = new FourEquations();
		int result1 = fourEquations.Add(3, 8);
		System.out.println(result1);
		
		int result2 = fourEquations.Subtract(1, 13);
		System.out.println(result2);
		
		int result3 = fourEquations.Multiply(2, 10);
		System.out.println(result3);
		
		int result4 = fourEquations.Divide(21, 7);
		System.out.println(result4);

	}

}
