package less.lesson05;

public class PersonDemo {
	public static void main(String[] args) {
		String s = new String();
		Person ivan;
		ivan = new Person();
		Person maria = new Person();
		Person person = new Person();
		
		ivan.name = "Ivan";
		maria.name = "Maria";
		
		ivan.age = 20;
		maria.age = 30;
		
		ivan.isMale = true;
		maria.isMale = false;
		
		ivan.personalNumber = 10203040;
		maria.personalNumber = 20304050;
		
		ivan.weight = 80.5;
		maria.weight = 54.3;
		
		System.out.println(ivan.name);
		System.out.println(ivan.age);
		System.out.println(maria.age);
		
		ivan.friend = maria;
		//maria.friend = ivan;
		
		System.out.println(ivan.friend.age);
		maria.age = 31;
		System.out.println(ivan.friend.age);
		//System.out.println(ivan.friend.friend.name);
		System.out.println("=========");
		
		ivan.eat();
		maria.eat();
		ivan.walk();
		maria.walk();
		System.out.println(ivan.age);
		System.out.println(maria.age);
		ivan.growUp();
		//maria.growUp();
		System.out.println(ivan.age);
		System.out.println(maria.age);
		
		ivan.drinkWater(2.1);
		ivan.drinkWater(0.2);
		
	}
}
