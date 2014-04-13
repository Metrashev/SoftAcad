package less.lesson05;

public class MethodContainer {
	void method() {
		System.out.println("Method 1");
	}
	
	void method(int i) {
		System.out.println("Method int " + i);
	}
	
	void method(byte b) {
		System.out.println("Method byte");
	}
	
	void method(String s) {
		System.out.println("Method 3 " + s);
	}
	
	void method(String s, int i) {
		System.out.println("String: " + s);
		System.out.println("Int: " + i);
	}
	
	void method(int i, String s) {
		System.out.println("Int: " + i);
		System.out.println("String: " + s);
	}
	
	
}
