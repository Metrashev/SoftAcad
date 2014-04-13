package less.lesson12;

public class PersonDemo {
	public static void main(String[] args) {
//		try {
//			Person johnie = new Person();
//			Person john = new Person("John");
//			
//			johnie.hasTheSameName(john);
//			//john.hasTheSameName(johnie);
//			System.out.println("END");
//		} catch(ArrayIndexOutOfBoundsException aioobe) {
//			System.out.println("AIOOBE!");
//		} catch (NullPointerException npe) {
//			System.out.println("ERROR! NPE!");
//			
//		}
		method1();
		System.out.println("OUTER END");
	}
	
	private static void method1() {
		Person johnie = new Person();
		Person john = new Person("John");
		try {
			johnie.hasTheSameName(john);
			//john.hasTheSameName(johnie);
			System.out.println("END");
		} catch(ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("AIOOBE!");
		} catch (NullPointerException npe) {
			System.out.println("ERROR! NPE!");
			
		}
	}
}
