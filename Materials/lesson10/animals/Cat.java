package less.lesson10.animals;

public class Cat extends Animal {
	public void climb() {
		System.out.println("Climbing...");
	}
	
	@Override
	public void makeSomeNoise() {
		System.out.println("meow-meow");
	}
	
	@Override
	public void walk() {
		System.out.println("Walking like a cat...");
	}
}
