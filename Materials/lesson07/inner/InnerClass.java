package less.lesson07.inner;

public class InnerClass {
	public boolean boolean1; // Public
	String string1; // Package/Default
	private int int1; // Private
	
	void testMethod() {
		System.out.println(boolean1);
		System.out.println(string1);
		System.out.println(int1);
		
		m1();
		m2();
		m3();
	}
	
	public void m1() {}
	void m2() {}
	private void m3() {}
}
