package less.lesson09;

public class Car {
	private String model;
	private int maxSpeed;
	private int year;

	public Car(String model, int maxSpeed, int year) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return
				"Model: " + model +
				"\nMax Speed: " + maxSpeed + 
				"\nYear: " + year;
	}
}
