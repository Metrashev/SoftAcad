package less.lesson05;

public class Person {
	String name;
	int age;
	long personalNumber;
	boolean isMale;
	double weight;
	Person friend;
	
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
}
