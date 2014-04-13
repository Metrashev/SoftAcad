package less.lesson07.inner;

public class AccessClass {
	void method() {
		InnerClass ic = new InnerClass();
		System.out.println(ic.boolean1);
		System.out.println(ic.string1);
		//System.out.println(ic.int1);
		ic.m1();
		ic.m2();
		//ic.m3();
	}
}
