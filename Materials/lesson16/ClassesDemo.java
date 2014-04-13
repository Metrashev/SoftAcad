package lessons.lesson16;

public class ClassesDemo {
	public static void main(String[] args) {
		NestedClassesDemo.NestedStaticClass sc = new NestedClassesDemo.NestedStaticClass();
		sc.nestedM1();
		
		NestedClassesDemo ncd = new NestedClassesDemo();
		NestedClassesDemo.InnerClass ic = ncd.new InnerClass();
		ic.nestedM2();
	}
}
