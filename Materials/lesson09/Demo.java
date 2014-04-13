package less.lesson09;

import less.lesson09.constructors.SubClass;

public class Demo {
	public static void main(String[] args) {
		SubClass subClass = new SubClass();
		subClass.print();
		subClass.str = "123";
		subClass.print();

		subClass.print();
		System.out.println(subClass.str);
	}
}
