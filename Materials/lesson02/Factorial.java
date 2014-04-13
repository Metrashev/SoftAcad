package less.lesson02;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter num: ");
		int num = s.nextInt();

		for(int i = num-1; i>1; i--) {
			num *= i;
		}
		
		/*
		 * num = 5
		 * i == 4; num *= i => num = 5 * 4
		 * i == 3; num *= i => num = 20 * 3
		 * i == 2; num *= i => num = 60 * 2;
		 */
		
		System.out.println("Answer: " + num);
	}
}
