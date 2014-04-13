package less.lesson10.animals;

public class AnimalDemo {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.breathe();
		
//		Cat c = new Cat();
//		c.breathe();
//		c.climb();
//		
//		Dog b = new Dog();
//		b.breathe();
//		b.bringStick();
//		
//		Bird bird = new Bird();
//		bird.breathe();
//		bird.fly();
		
		Animal[] animals = {new Cat(), new Bird(), new Dog(), new Eagle(), new Sparrow()};
		for (Animal animal : animals) {
			animal.makeSomeNoise();
		}
	}
}
