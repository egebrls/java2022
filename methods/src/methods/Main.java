package methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
	
	}
	
	public static void findNumber() {
		int[] numbers = new int[]{4 , 7, 16, 9, 33};
		int search = 3;
		boolean doesExist = false;
		
		for(int number : numbers) {
			if (number == search) {
				doesExist = true;
				break;
			}
		}
		if(doesExist) {
			showMessage(search + " is in the array.");
		}
		else {
			showMessage(search + " is not in the array.");
		}
	}
	
	public static void showMessage(String message) {
		System.out.println(message);
	}
	
}
