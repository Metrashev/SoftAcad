package less.lesson10.animals;

public class OverrideDemo {
	public static void main(String[] args) {
//		Bird b = new Bird();
//		Eagle e = new Eagle();
//		Sparrow s = new Sparrow();
//		
//		b.fly();
//		e.fly();
//		s.fly();
		
		Bird[] birds = new Bird[3];
		birds[0] = new Bird();
		birds[1] = new Eagle();
		birds[2] = new Sparrow();
		
		for (Bird bird : birds) {
			bird.fly();
		}
		
		for(int i=0; i<birds.length; i++) {
			birds[i].fly();
		}
	}
}
