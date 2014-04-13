package less.lesson07;

public class FinalStaticDemo {
	private final String FIRST_NAME;
	private final String LAST_NAME = "LN";
	private static int i1;
	private final int I2 = 5;
	private static final int I3 = 10;
	private int i4;
	
	public void m1() {
		System.out.println(i1);
		System.out.println(I2);
		System.out.println(I3);
		System.out.println(i4);
	}
	
	public static void m2() {
		System.out.println(i1);
		//System.out.println(I2);
		System.out.println(I3);
		//System.out.println(i4);
	}
	
	public FinalStaticDemo(String firstName) {
		FIRST_NAME = firstName;
	}
	
	public void demo() {
		System.out.println(FIRST_NAME);
		//FIRST_NAME = "str";
		System.out.println(LAST_NAME);
	}
	
	public void demo(final Person person) {
		System.out.println(person.getAddress());
		//person = new Person("Other name", 30, false, "bg", 102030, "xyz");
		person.setAge(50);
	}
	
	public static void main(String[] args) {
		FinalStaticDemo fd = new FinalStaticDemo("First name here");
		fd.demo();
		
		Person p = new Person("F L name", 20, true, "sf", 123, "abc");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		fd.demo(p);
		System.out.println(p.getAge());
		
	}
}
