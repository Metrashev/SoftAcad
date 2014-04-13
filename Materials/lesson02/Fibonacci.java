package less.lesson02;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num: ");
		int n = sc.nextInt();
	
		
		int f = 1;
		int s = 1;
		int sum = 0;
		int arr[] = new int[10];
		for(int i=0; i<arr.length; i++) {
			System.out.print(f + " ");
			sum += f;
			
			int tmp = f;
			f = s;
			s += tmp;
		}
		
		System.out.println();
		System.out.println("SUM = " + sum);
	}
}
