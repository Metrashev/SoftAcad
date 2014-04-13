package less.lesson06;


public class PersonDemo {
	public static void main(String[] args) {
		Person p1 = new Person("Person 1", 20);
		Person p2 = new Person();
		Person p3 = new Person("Person 3", 30, 80);
//		p1 = new Person();
//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		
//		System.out.println(p2.name);
//		System.out.println(p2.age);
//		
//		p1.thisDemo();
//		p1.thisDemo("str");
		
		p1.money = 2000;
		
		Car c = new Car("car 1");
		p1.buyCar(c);
	}
}
