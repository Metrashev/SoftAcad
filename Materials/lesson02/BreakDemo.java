package less.lesson02;

public class BreakDemo {
	public static void main(String[] args) {
		for(int i=1; i<=20; i++) {
			System.out.println("Print 1: " + i);
			if(i == 5) {
				break;
			}
			System.out.println("Print 2: " + i);
		}
		
		System.out.println("END");
		
		for(int i=1; i<=5; i++) {
			if(i == 4) {
				break;
			}
			for(int x=1; x<=3; x++) {
				System.out.println("i = " + i + " x = " + x);
				if(i == 2 && x == 1) {
					break;
				}
			}
		}
	}
}
