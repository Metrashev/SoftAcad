package less.lesson02;
import java.util.Scanner;

public class Task05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = s.nextInt();
		
		while(n >= 7) {
			if(n % 7 == 0) {
				System.out.println(n);
			}
			
			n--;
		}
	}
}
