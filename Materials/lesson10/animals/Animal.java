package less.lesson10.animals;

public abstract class Animal {
	int age;
	double weight;
	
	void breathe() {
		System.out.println("Breathing...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	public abstract void makeSomeNoise();
}
