package less.lesson20;

import java.util.Comparator;

public class CatComarator implements Comparator<Cat> {
	@Override
	public int compare(Cat o1, Cat o2) {
		if(o1.getAge() > o2.getAge()) {
			return 1;
		} else if(o1.getAge() < o2.getAge()) {
			return -1;
		}
		
		return 0;
	}
}
