package less.lesson10;

import less.lesson10.animals.Animal;
import less.lesson10.animals.Bird;
import less.lesson10.animals.Cat;
import less.lesson10.animals.Dog;
import less.lesson10.animals.Eagle;
import less.lesson10.animals.Sparrow;

public class ZooDemo {
	public static void main(String[] args) {
		Zoo zoo = new Zoo(10);
		zoo.addAnimal(new Cat());
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Eagle());
		zoo.addAnimal(new Bird());
		zoo.addAnimal(new Sparrow());
		
		for(Animal animal : zoo.getAllAnimals()) {
			if(animal != null) {
//				animal.walk();
				animal.makeSomeNoise();
			}
		}
		
		Animal cat = new Cat();
		cat.walk();
		//cat.climb();
		Cat c = (Cat) cat;
		c.climb();
		Animal b = new Dog();
		b.walk();
		b.makeSomeNoise();
		
		
	}
}
