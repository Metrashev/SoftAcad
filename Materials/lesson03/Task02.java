package less.lesson03;

import java.util.Scanner;

public class Task02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = s.nextInt();
		
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			System.out.print("Enter element[" + (i+1) + "/" + arr.length + "]: ");
			arr[i] = s.nextInt();
		}
		
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < max) {
				max = arr[i];
			}
		}
		
//		int max = Integer.MIN_VALUE;
//		for(int i=0; i<arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("MAX: " + max);
	}
}
