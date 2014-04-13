package less.lesson02;

import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = s.nextInt();
		
		int i = 7;
		while(i <= n) {
			System.out.println(i);
			i += 7;
		}
	}
}
