package less.lesson07;

public class Util {
	public static final double PI = 3.14;

	private Util() {
	}
	
	public static double rectSurface(double a, double b) {
		return a*b;
	}
	
	public static double circlePerimeter(double radius) {
		return 2 * PI * radius;
	}
}
