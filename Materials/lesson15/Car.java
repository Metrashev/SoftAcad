package less.lesson15;

public class Car {
	private String make;

	public Car(String make) {
		super();
		this.make = make;
	}
	
	@Override
	public String toString() {
		return "Car: " + make;
	}
	
}
