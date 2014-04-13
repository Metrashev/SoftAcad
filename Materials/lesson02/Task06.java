package less.lesson02;

import java.util.Scanner;

public class Task06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = s.nextInt();
		
		int row = 1;
		while(row <= n) {
			int i = row;
			while(i <= n * row) {
				System.out.print(i + " ");
				i += row;
			}
			System.out.println();
			row++;
		}
	}
}
