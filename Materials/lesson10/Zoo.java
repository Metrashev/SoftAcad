package less.lesson10;

import less.lesson10.animals.Animal;

public class Zoo {
	private Animal[] animals;
	
	public Zoo(int size) {
		animals = new Animal[size];
	}
	
	public void addAnimal(Animal animal) {
		for(int i=0; i<animals.length; i++) {
			if(animals[i] == null) {
				animals[i] = animal;
				return;
			}
		}
		
		System.out.println("No free places left!");
	}
	
	public Animal[] getAllAnimals() {
		return animals;
	}
}
