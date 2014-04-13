package less.lesson09.animals;

public class AnimalDemo {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.breathe();
		
		Cat c = new Cat();
		c.breathe();
		c.climb();
		
		Dog b = new Dog();
		b.breathe();
		b.bringStick();
		
		Bird bird = new Bird();
		bird.breathe();
		bird.fly();
	}
}
