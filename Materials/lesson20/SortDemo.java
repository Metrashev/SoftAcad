package less.lesson20;

import java.util.Arrays;

public class SortDemo {
	public static void main(String[] args) {
		Cat[] cats = {
				new Cat("c1", 2),
				new Cat("c2", 1),
				new Cat("c3", 3),
				new Cat("c4", 1),
				new Cat("c5", 2),
				new Cat("c6", 4),
				new Cat("c7", 5),
				new Cat("c8", 7),
				new Cat("c9", 8),
		};
		
		for (Cat cat : cats) {
			System.out.println(cat);
		}
		
		Arrays.sort(cats);
		
		System.out.println("=====");
		for (Cat cat : cats) {
			System.out.println(cat);
		}
	}
}
