package less.lesson06;

public class Car {
	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	int currentGear;
	Person owner;
	double price;
	boolean isSportsCar;
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, boolean isSportsCar) {
		this(model);
		this.isSportsCar = isSportsCar;
	}
	
	Car(String model, boolean isSportsCar, String color) {
		this(model, isSportsCar);
		this.color = color;
	}
	
	Car(String model, boolean isSportsCar, String color, double price) {
		this(model, isSportsCar, color);
		this.price = price;
	}
	
	Car(String model, boolean isSportsCar, String color, double price, int maxSpeed) {
		this(model, isSportsCar, color, price);
		this.maxSpeed = maxSpeed;
		if(maxSpeed > 200) {
			this.isSportsCar = true;
		}
	}
	
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
	
	boolean isMoreExpensive(Car car) {
		if(car != null && this.price > car.price) {
			return true;
		}
		return false;
	}
	
	double calculateCarPriceForScrap(double metalPrice) {
		double coef = 0.2;
		if(color != null && (color.equalsIgnoreCase("white") || color.equalsIgnoreCase("black"))) {
			coef += 0.05;
		}
		
		if(isSportsCar) {
			coef += 0.05;
		}
		
		return metalPrice * coef;
	}
	
	void changeOwner(Person owner) {
		this.owner = owner;
	}
}
