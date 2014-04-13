package less.lesson01;

public class OperatorsDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c;
		
		c = a + b;
		System.out.println(c);
		c = a - b;
		System.out.println(c);
		c = b / a;
		System.out.println(c);
		c = a / b;
		System.out.println(c);
		c = a % b;
		System.out.println(c);
		c = 5 / 2;
		System.out.println(c);
		c = 5 % 2;
		System.out.println(c);
		
		System.out.println("=====================");
		c = 10;
		//int d = 10;
		System.out.println(c);
		c += 3;
		//c = c + 3;
		System.out.println(c);
		c -= 4;
		//c = c - 4;
		System.out.println(c);
		c *= 4;
		//c = c * 4;
		System.out.println(c);
		c /= 2;
		System.out.println(c);
		c %= 2;
		System.out.println(c);
		
		boolean result = 2 == 4;
		System.out.println(result);
		result = 2 != 4;
		System.out.println(result);
		result = 4 != 4;
		System.out.println(result);
		result = 4 == 4;
		System.out.println(result);
		
		a = 2;
		b = 4;
		result = a == b;
		System.out.println(result);
		result = a != b;
		System.out.println(result);
		
	}
}
