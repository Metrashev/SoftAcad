package less.lesson20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		//List l = new LinkedList();
		List l = new ArrayList();
		System.out.println(l.size());
		l.add(new Cat("c1"));
		System.out.println(l.size());
		l.add(new Cat("c1"));
		System.out.println(l.size());
		Cat c = new Cat("cat");
		l.add(c);
		l.add(c);
		System.out.println(l.size());
		Cat c1 = new Cat("other cat");
		System.out.println(l.contains(c1));
		System.out.println(l.contains(c));
		System.out.println(l.get(0));
		l.remove(0);
		System.out.println(l.get(0));
		l.remove(c);
		System.out.println(l.contains(c));
		l.remove(c);
		System.out.println(l.contains(c));
		
		System.out.println(l.size());
		l.add(new Cat("c2"));
		l.add(new Cat("c3"));
		l.add(new Cat("c4"));
		l.add(new Cat("c5"));
		l.add(new Cat("c6"));
		l.add(new Cat("c7"));
		l.add(new Cat("c8"));
		
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		//((Cat)l.get(4)).getAge();
		
		System.out.println();
		
		Iterator it = l.iterator();
		it.next();
		it.next();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("====");
		it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
