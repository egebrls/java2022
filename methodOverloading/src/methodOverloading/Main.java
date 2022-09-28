package methodOverloading;

public class Main {

	public static void main(String[] args) {
		
		FourOperations fourOperations = new FourOperations();
		System.out.println(fourOperations.Add(5, 7));
		
		System.out.println(fourOperations.Add(5, 9, 16, 3));
	}

}
