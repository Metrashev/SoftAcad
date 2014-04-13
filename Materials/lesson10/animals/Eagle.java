package less.lesson10.animals;

public class Eagle extends Bird {

	public void fly() {
		System.out.println("Flying like an eagle...");
	}
	
	
	@Override
	public void walk() {
		System.out.println("Walking like an eagle...");
	}
}
