package lessons.lesson16;

public class NestedClassesDemo {
	private String nonStaticOuterStr;
	private static String staticOuterStr;
	
	public void m1() {
		System.out.println(nonStaticOuterStr);
		System.out.println(staticOuterStr);
		
		System.out.println(NestedStaticClass.staticStr);
	}
	
	public static class NestedStaticClass {
		private String nonStaticStr;
		private static String staticStr;
		
		public void nestedM1() {
//			System.out.println(nonStaticOuterStr);
			System.out.println(staticOuterStr);
			
			System.out.println(nonStaticStr);
			System.out.println(staticStr);
		}
	}
	
	public class InnerClass {
		private String nonStaticStr;
//		private static String staticStr;
		
		public void nestedM2() {
			System.out.println(nonStaticStr);
			
			System.out.println(nonStaticOuterStr);
			System.out.println(staticOuterStr);
		}
	}
}
