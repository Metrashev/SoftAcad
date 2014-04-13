package less.lesson09;

import less.lesson09.internal.ModifiersClass;

public class ModifiersAccess {
	public static void main(String[] args) {
		ModifiersClass mc = new ModifiersClass();
		System.out.println(mc.s1);
		//System.out.println(mc.s2);
		//System.out.println(mc.s3);
		//System.out.println(mc.s4);
	}
}
