package vowels;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Bir harf girin: ");
		char c = input.next().charAt(0);

		
		switch(c) {
			case 'A':
			case 'a':
			case 'I':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				System.out.println("Bu bir kalin sesli harf.");
				break;
			case 'E':
			case 'e':
			case 'i':
			case 'Ö':
			case 'ö':
			case 'Ü':
			case 'ü':
				System.out.println("Bu bir ince sesli harf.");
				break;
			default:
				System.out.println("Bu bir sesli harf degil.");
				
		}
			
	}

}
