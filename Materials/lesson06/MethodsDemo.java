package less.lesson06;


public class MethodsDemo {
	public static void main(String[] args) {
		MethodsContainer mc = new MethodsContainer();
		mc.method1(false);
		System.out.println("==========");
		mc.method1(true);
		
		int i = mc.method2(13);
		System.out.println(i);
		i = mc.method2(30);
		System.out.println(i);
		System.out.println(mc.method2(44));
		
		boolean b = mc.method3(true);
		System.out.println(b);
		System.out.println("=======");
		b = mc.method3(mc.method3(true));
		System.out.println(b);
		Person p = mc.method4(25);
		System.out.println(p.age);
		System.out.println(p.name);
		
	}
}
