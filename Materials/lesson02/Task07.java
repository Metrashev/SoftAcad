package less.lesson02;

import java.util.Scanner;

public class Task07 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter num: ");
		int n = s.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print(n + " ");
		}
		System.out.println("!");
	}
}
