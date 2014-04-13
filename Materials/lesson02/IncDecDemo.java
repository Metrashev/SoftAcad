package less.lesson02;

public class IncDecDemo {
	public static void main(String[] args) {
		int i = 1;
		
		System.out.println(i);
		i++; // i += 1; // i = i + 1;
		System.out.println(i);
		++i;
		System.out.println(i);
		i--; // i -= 1; // i = i - 1;
		System.out.println(i);
		--i;
		System.out.println(i);
		
		System.out.println("=============");
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i);
		
		System.out.println("=============");
		System.out.println(i);
		System.out.println(i--);
		System.out.println(i);
		System.out.println(--i);
		System.out.println(i);
	}
}
