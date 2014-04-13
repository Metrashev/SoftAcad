package less.lesson12;

public class Person {
	private String name;
	
	public Person() {
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public boolean hasTheSameName(Person p) {
		return name.equals(p.name);
	}
}
