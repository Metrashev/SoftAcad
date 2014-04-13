package less.lesson10;

public class UpcastingDemo {
	public static void main(String[] args) {
		String str = "string";
		Object obj = null;
		doSmt(str);
		doSmt(obj);
		doSmt((Object) str);
		
	}
	
	public static void doSmt(String str) {
		System.out.println("String!");
	}
	
	public static void doSmt(Object obj) {
		System.out.println("Object!");
	}
}
