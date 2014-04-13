package less.lesson06;


public class CarShop {
	Car[] cars;
	
	CarShop(int capacity) {
		cars = new Car[capacity];
	}
	
	public static void main(String[] args) {
		Car car = new Car("Car1", false, "Red", 20000, 205);
		System.out.println(car.isSportsCar);
		
		Car c1 = new Car("Car 1");
		Car c2 = new Car("Car 2");
		Car c3 = null;
		
		c1.price = 1000;
		c2.price = 2000;
		
		boolean result = c1.isMoreExpensive(c2);
		System.out.println(result);
		result = c2.isMoreExpensive(c1);
		System.out.println(result);
		result = c1.isMoreExpensive(c1);
		System.out.println(result);
		result = c1.isMoreExpensive(c3);
		System.out.println(result);
		
		
		c1.color = "White";
		c1.isSportsCar = true;
		System.out.println(c1.calculateCarPriceForScrap(1000));
	}
}
