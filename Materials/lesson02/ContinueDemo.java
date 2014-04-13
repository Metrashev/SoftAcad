package less.lesson02;

public class ContinueDemo {
	public static void main(String[] args) {
		for(int i=1; i<=20; i++) {
			if(i >= 8 && i <= 12) {
				continue;
			}
			System.out.print(i + ",");
		}
	}
}
