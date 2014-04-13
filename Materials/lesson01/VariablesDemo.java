package less.lesson01;

public class VariablesDemo {
	public static void main(String[] args) {
		byte b = 20;
		// byte b2 = 200;
		short s = 3000;
		int i = 3000000;
		long l = 9000000000L;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);

		float f = 3.14F;
		double d = 3.14;

		System.out.println(f);
		System.out.println(d);
		
		char ch1 = 'a';
		char ch2 = 'A';
		char ch3 = '1';
		char ch4 = '?';
		//char ch5 = 'abc';
		
		boolean bT = true;
		boolean bF = false;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		
		System.out.println(bT);
		System.out.println(bF);
		
		char uni0 = '\u0000';
		System.out.println(uni0);
		char uni1 = '\u0001';
		System.out.println(uni1);
		char uni148 = '\u0210';
		System.out.println(uni148);
		char uni = '\u1234';
		System.out.println(uni);
	}
}
