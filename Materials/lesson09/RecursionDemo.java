
package less.lesson09;

public class RecursionDemo {
	public static void main(String[] args) {
		int num = 10;
		print(num);
	}
	
	private static void print(int i) {
		System.out.println(i);
		i--;
		if(i>0) {
			print(i);
		}
	}
}
