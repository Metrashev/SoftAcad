package less.lesson09.animals;

public class Sparrow extends Bird {
	
	@Override
	public void fly() {
		System.out.println("Flying like a sparrow...");
		System.out.print("M: ");
		super.fly();
	}
}
