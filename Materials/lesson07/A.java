package less.lesson07;

public class A {
	public static int x;
	public int y;
	
	public A(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
/*	public void printXY() {
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
*/	
	public static void main(String[] args) {
		A a1 = new A(10, 20);
		System.out.println(a1.x);
		System.out.println(a1.y);
//		a1.printXY();
		
		System.out.println("=====================");
		
		A a2 = new A(2, 3);
		System.out.println(a2.x);
		System.out.println(a2.y);
	//	a2.printXY();
		System.out.println("===========");
		//a1.printXY();
		
		System.out.println(a1.x);
		System.out.println(a2.x);
		a1.x = 7;
		System.out.println(a1.x);
		System.out.println(a2.x);
		a2.x = 9;
		System.out.println(a1.x);
		System.out.println(a2.x);
		A.x = 11;
		System.out.println(a1.x);
		System.out.println(a2.x);
		
		/*a1.printXY();
		a2.printXY();*/
	}
}
