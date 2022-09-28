package methodOverloading;

public class FourOperations {
	public int Add(int number1, int number2) {
		return number1 + number2;
	}

	public int Add(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

}
