package less.lesson10.animals;

public class Dog extends Animal {
	boolean isDangerous;
	
	void bringStick() {
		System.out.println("Bringing a stick...");
	}
	
	void test() {
		System.out.println(age);
	}
	
	@Override
	public void makeSomeNoise() {
		System.out.println("bau-bau");
	}
	
	@Override
	public void walk() {
		System.out.println("Walking like a dog...");
	}
}
