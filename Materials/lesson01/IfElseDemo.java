package less.lesson01;

public class IfElseDemo {
	public static void main(String[] args) {
		int i = 5;
		
		if (i < 0) {
			System.out.println("I is negative");
		} else {
			System.out.println("I is positive");
		}
		
		
		boolean result = i < 0;
		if (result) {
			System.out.println("I is negative");
		} else {
			System.out.println("I is positive");
		}
		
		boolean condition = false;
		
		if(condition == true) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		
		System.out.println("============");
		
		boolean a = false;
		boolean b = false;
		
		result = a || b;
		System.out.println(result);
		
		result = a && b;
		System.out.println(result);
		
		a = true;
		result = a || b;
		System.out.println(result);
		
		result = a && b;
		System.out.println(result);
		
		b = true;
		result = a || b;
		System.out.println(result);
		
		result = a && b;
		System.out.println(result);
		
		System.out.println("============");
		System.out.println(a);
		
		result = !a;
		System.out.println(result);
		
		result = !result;
		System.out.println(result);
		
		System.out.println("==========");
		if(true || false) { // or
			System.out.println("true or false");
		}
		
		if(true && false) { // and
			System.out.println("true and false");
		}
		
		if(!false) {
			System.out.println("to print or not to print :)");
		}
		
		if(-5 > 0) 
			System.out.println("1 > 0");
			System.out.println("SMT, SMT");
			
		int num = 2;
		
		if(num == 0) {
			System.out.println("Nula");
		} else if(num == 1) {
			System.out.println("Edno");
		} else if(num == 2) {
			System.out.println("Dve");
		} else if(num == 3) {
			System.out.println("Tri");
		} else {
			System.out.println("ne moga da broq do tolkova :>");
		}
		
		if(num > 0) {
			System.out.println("Positive");
			if(num > 2) {
				System.out.println("num > 2");
			} else {
				System.out.println("num <= 2");
			}
		}
		
		System.out.println("END");
	}
}
