package less.lesson05;

public class CarDemo {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.model = "model 1";
		car1.maxSpeed = 200;
		car1.currentSpeed = 130;
		car1.currentGear = 6;
		car1.color = "Red";
		
		car2.model = "Model 2";
		car2.maxSpeed = 250;
		car2.currentSpeed = 60;
		car2.currentGear = 4;
		car2.color = "White";
		
		System.out.println(car2.model);
		System.out.println(car2.currentSpeed);
		System.out.println(car2.currentGear);
		System.out.println("======");
		car2.currentSpeed = 100;
		car2.currentGear = 5;
		System.out.println(car2.currentSpeed);
		System.out.println(car2.currentGear);
		
		car1.owner = new Person();
		car1.owner.name = "Ivan";
		car1.owner.age = 30;
		car1.owner.isMale = true;
		car1.owner.personalNumber = 1020304050;
		
		car1.owner.walk();
		
		car1.changeColor("blue");
		System.out.println(car1.color);
		car1.changeColor("");
		car1.currentSpeed = 198;
		System.out.println(car1.currentSpeed);
		car1.accelerate();
		System.out.println(car1.currentSpeed);
		car1.accelerate();
		System.out.println(car1.currentSpeed);
		car1.accelerate();
		System.out.println(car1.currentSpeed);
		car1.accelerate();
		System.out.println(car1.currentSpeed);
		
		car1.currentGear = 4;
		System.out.println(car1.currentGear);
		car1.changeGearUp();
		System.out.println(car1.currentGear);
		car1.changeGearUp();
		System.out.println(car1.currentGear);
		car1.changeGearUp();
		System.out.println(car1.currentGear);
		
		car1.currentGear = 2;
		System.out.println(car1.currentGear);
		car1.changeGearDown();
		System.out.println(car1.currentGear);
		car1.changeGearDown();
		System.out.println(car1.currentGear);
		
		car1.changeGear(0);
		car1.changeGear(3);
		System.out.println(car1.currentGear);
		car1.changeGear(9);
		System.out.println(car1.currentGear);
	}
}
