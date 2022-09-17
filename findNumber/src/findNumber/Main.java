package findNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		boolean doesExist = false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the number you want to check: ");
		int number = input2.nextInt();
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == number) {
				doesExist = true;
			}
		}
		if(doesExist) {
			System.out.println("This number is in the array.");
		}
		else {
			System.out.println("This number is not in the array.");
		}
		
	}

}
