package less.lesson06;


public class Person {
	String name;
	int age;
	long personalNumber;
	boolean isMale;
	double weight;
	Person[] friends;
	double money;
	Car car;
	
	Person() {
		this.age = 0;
		this.weight = 4;
		this.friends = new Person[3];
		System.out.println("Person was created...");
	}
	
	Person(int age) {
		this();
		this.age = age;
	}
	
	Person(String name, int age) {
		this(age);
		this.name = name;
	}
	
	Person(String name, int age, double weight) {
		this(name, age);
		this.weight = weight;
	}
	
	Person(String name, long personalNumber, boolean isMale) {
		this();
		this.name = name;
		this.personalNumber = personalNumber;
		this.isMale = isMale;
	}
	
	void eat() {
		System.out.println("Eating...");
	}
	
	void walk() {
		System.out.println(name + " is walking...");
	}
	
	void growUp() {
		age++;
	}
	
	void drinkWater(double liters) {
		if(liters > 1) {
			System.out.println("Too much water (" + liters + ").");
		} else {
			System.out.println(liters + " are in " + name);
		}
	}
	
	void thisDemo() {
		System.out.println("Name: " + this.name);
		System.out.println("Name: " + name);
	}
	
	void thisDemo(String name) {
		System.out.println("Name: " + this.name);
		System.out.println("Name: " + name);
	}
	
	void buyCar(Car car) {
		if(car != null) {
			if(car.price < money) {
				this.car = car;
				car.changeOwner(this);
			}
		}
	}
	
	double sellCarForScrap(double metalPrice) {
		if(car != null) {
			double amount = car.calculateCarPriceForScrap(metalPrice);
			money += amount;
			car.changeOwner(null);
			car = null;
			return amount;
		}
		
		return -1;
	}
	
}
