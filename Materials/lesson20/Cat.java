package less.lesson20;

public class Cat implements Comparable {
	private String name;
	private int age;

	public Cat(String name) {
		super();
		this.name = name;
	}
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Cat) {
			Cat c = (Cat) o;
			if(this.age > c.age) {
				return 1;
			} else if(this.age < c.age) {
				return -1;
			} else {
				return 0;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return name + " (" + age + "): " + super.toString();
	}
}
