package less.lesson12;

public class Task {
	public static void main(String[] args) {
		int[] arr;
		arr = null;
//		arr = new int[2];
//		arr = new int[20];
		printArrayInfo(arr);
		System.out.println("===");
		printArrayInfo2(arr);
	}
	
	private static void printArrayInfo(int[] arr) {
		try {
			System.out.println(arr.length);
			System.out.println(arr[3]);
		} catch(NullPointerException npe) {
		} catch(ArrayIndexOutOfBoundsException aioobe) {
		}
		
		System.out.println("text");
	}
	
	private static void printArrayInfo2(int[] arr) {
		if(arr != null) {
			System.out.println(arr.length);
			if(arr.length >= 3) {
				System.out.println(arr[3]);
			}
		}
		
		System.out.println("test");
	}
}
