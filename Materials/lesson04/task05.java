package less.lesson04;

import java.util.Scanner;

public class task05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Ваведи начална стойност на километража:");
		double NS = s.nextDouble();
		System.out.print("Въведи крайна стойност на километража:");
		double KS = s.nextDouble();
		System.out.print("Въведи количество гориво, което сте заредили:");
		double KolGorivo = s.nextDouble();
		double in;
		double out;

		out = (KolGorivo) / (KS - NS);
		in = out * 100;

		if (in > 10) {
			System.out.println("Колата харчи над 10л на 100км!!!");
		} else {
			System.out.print("Колата Ви изразходва" + " " + in + " "
					+ "литра на 100 километра! ");
			System.out.println();
			System.out.println("Поздравления!");
		}

	}
}
