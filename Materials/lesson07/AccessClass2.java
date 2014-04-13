package less.lesson07;

import less.lesson07.inner.InnerClass;

public class AccessClass2 {
	void method() {
		InnerClass ic = new InnerClass();
		System.out.println(ic.boolean1);
	//System.out.println(ic.string1);
//		System.out.println(ic.int1);
		
		ic.m1();
//		ic.m2();
//		ic.m3();
	}
}
