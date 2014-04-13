package less.lesson10.animals;

public class Bird extends Animal {
	double flyingSpeed;
	
	public void fly() {
		System.out.println("Flying...");
	}

	@Override
	public void makeSomeNoise() {
		System.out.println("Piu-piu");
	}
	
	@Override
	public void walk() {
		System.out.println("Walking like a bird...");
	}
}
