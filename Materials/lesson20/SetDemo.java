package less.lesson20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		Cat c1 = new Cat("Cat 01");
		System.out.println(set.size());
		set.add(c1);
		System.out.println(set.size());
		set.add(c1);
		System.out.println(set.size());
		set.remove(c1);
		System.out.println(set.size());
		set.add(new Cat("Cat 02"));
		System.out.println(set.size());
		set.add(new Cat("Cat 02"));
		System.out.println(set.size());
		set.add(c1);
		System.out.println(set.size());
		set.add(new Cat("Cat 03"));
		set.add(new Cat("Cat 04"));
		set.add(new Cat("Cat 05"));
		set.add(new Cat("Cat 06"));
		set.add(new Cat("Cat 07"));
		set.add(new Cat("Cat 08"));
		set.add(new Cat("Cat 09"));
		Cat c2 = new Cat("Cat 10"); 
		set.add(c2);
		System.out.println(set.size());
		
		System.out.println("=====");
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=======");
		Set set2 = new HashSet();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		set2.add(10);
		set2.add(11);
		set2.add(33);
		set2.add(22);
		set2.add(44);
		it = set2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(set.contains(c1));
		set.remove(c1);
		System.out.println(set.contains(c1));
		set.add(c1);
		System.out.println(set.contains(c1));
	}
}
