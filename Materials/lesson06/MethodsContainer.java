 package less.lesson06;


public class MethodsContainer {
	
	void method1(boolean b) {
		System.out.println("start");
		if(b) {
			return;
		}
		System.out.println("end");
	}
	
	int method2(int num) {
		return num + 10;
	}
	
	boolean method3(boolean b) {
		System.out.println("Param: " + b);
		return !b;
	}
	
	Person method4(int age) {
		return new Person(age);
	}
}
