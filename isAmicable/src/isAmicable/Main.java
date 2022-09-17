package isAmicable;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number1 = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter another number: ");
		int number2 = input2.nextInt();
		
		if(number1 == number2) {
			System.out.println("Please enter two different numbers. ");
			return;
		}
		
		int total1 = 0;
		int total2 = 0;
		
		for(int i = 1; i < number1; i++) {
			if(number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		for(int i = 1; i < number2; i++) {
			if(number2 % i == 0) {
				total2 = total2 + i;
			}
		}
		
		if(total1 == number2 && total2 == number1) {
			System.out.println("These are amicable numbers.");
		}
		else {
			System.out.println("These are not amicable numbers.");
		}
	}

}
