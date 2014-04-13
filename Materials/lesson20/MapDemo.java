package less.lesson20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("one", "1");
		map.put("two", 2);
		map.put("three", "3");
		map.put(4, "four");
		Cat c = new Cat("cat 01");
		map.put(c, "kotka");
		Object o = new Object();
		map.put(o, c);
		
		List l = new LinkedList();
		l.add(new Cat("1"));
		l.add(new Cat("2"));
		l.add(new Cat("3"));
		l.add(new Cat("4"));
		
		map.put("cats", l);
		map.put(l, "cats");
		
		System.out.println(map.size());
		
		Set keys = map.keySet();
		Iterator keyIterator = keys.iterator();
		while(keyIterator.hasNext()) {
			Object key = keyIterator.next();
			Object value = map.get(key);
			System.out.println(key + " -> " + value);
		}
		
		System.out.println("====");
		List cats = (List)map.get("cats");
		System.out.println(cats.size());
		cats.add(new Cat("new cat"));
		
		cats = (List)map.get("cats");
		System.out.println(cats.size());
		System.out.println("===");
		map.put(10, "ten");
		System.out.println(map.get(10));
		map.put(10, "ten-ten");
		System.out.println(map.get(10));
		System.out.println(map.size());
		map.remove(10);
		System.out.println(map.size());
		
	}
}
