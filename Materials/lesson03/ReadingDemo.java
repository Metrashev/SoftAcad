package less.lesson03;

import java.util.Scanner;

public class ReadingDemo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int a = s.nextInt();

		int[] arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter element[" + (i + 1) + "]: ");
			arr[i] = s.nextInt();

		}

		for (int i : arr) {
			if (i % 3 == 0) {
				if (i < i + 3) {
					System.out.print(i + " ");

				}
			}
		}
	}
}