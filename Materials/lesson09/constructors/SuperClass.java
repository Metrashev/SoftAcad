package less.lesson09.constructors;

public class SuperClass {
	private int i;
	public String str;
	
	public SuperClass(int i) {
		this.i = i;
	}
	
	public void print() {
		System.out.println("Str: " + str);
	}
}
