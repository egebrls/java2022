package perfectNumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		int total = 0;
		
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		
		if(total == number) {
			System.out.println("This is a perfect number.");
		}
		else {
			System.out.println("This is not a perfect number.");
		}
		
		
		
	}
}
