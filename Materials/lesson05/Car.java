package less.lesson05;

public class Car {
	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	int currentGear;
	Person owner;
	
	void accelerate() {
		if(currentSpeed < maxSpeed) {
			currentSpeed++;
		} else {
			System.out.println("Max speed reached!");
		}
	}
	
	void changeGearUp() {
		if(currentGear < 6) {
			currentGear++;
		} else {
			System.out.println("Already on max gear");
		}
	}
	
	void changeGearDown() {
		if(currentGear > 1) {
			currentGear--;
		} else {
			System.out.println("Already on min gear");
		}
	}
	
	void changeGear(int nextGear) {
		if(nextGear <= 6 && nextGear >= 1) {
			currentGear = nextGear;
		} else {
			System.out.println("Invalid gear");
		}
	}
	
	void changeColor(String newColor) {
		if(newColor != null && newColor.length() > 0) {
			color = newColor;
		} else {
			System.out.println("Invalid color");
		}
	}
}
