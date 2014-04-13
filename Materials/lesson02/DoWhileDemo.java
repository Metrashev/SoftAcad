package less.lesson02;

public class DoWhileDemo {
	public static void main(String[] args) {
		boolean condition = false;
		
		while(condition) {
			System.out.println("While loop");
		}
		
		do {
			System.out.println("Do-While loop");
		} while(condition);
	}
}
