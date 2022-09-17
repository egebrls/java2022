package isPrime;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		boolean isPrime = true;
		
		if(number <= 1) {
			isPrime = false;
		}
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("This is a prime number.");
		}
		else {
			System.out.println("This is not a prime number.");
		}
	}
		

}
