package less.lesson05;

public class MethodsDemo {
	public static void main(String[] args) {
		MethodContainer mc = new MethodContainer();
		mc.method();
		mc.method(1);
		mc.method("string");
		mc.method("str", 10);
		mc.method(10, "str");
		
		byte bNum = 10;
		mc.method(bNum);
	}
}
