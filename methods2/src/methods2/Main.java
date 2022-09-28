package methods2;

public class Main {

	public static void main(String[] args) {
		
		int sayi = add2(8, 23);
		String city = showCityName();
		System.out.println(sayi);
		System.out.println(city);
		int total = add3(3, 5, 17, 6, 12);
		System.out.println(total);

	}
	
	public static void add1() {
		System.out.println("Added.");
	}
	
	public static void remove() {
		System.out.println("Removed.");

	}
	
	public static void update() {
		System.out.println("Updated.");

	}
	
	public static String showCityName() {
		
		return "Ankara";
	}
	
	public static int add2(int number1, int number2) {
		
		return number1 + number2;
	}
	
	public static int add3(int... numbers) {
		int total = 0;
		for(int number : numbers) {
			total += number;
		}
		return total;
	}
	

}
