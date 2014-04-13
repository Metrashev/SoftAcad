package less.lesson03;

public class IteratingDemo {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		System.out.println(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			//arr[i] = 0;
		}
		
		System.out.println();
		System.out.println("===============");
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("================");
		
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			System.out.print(num + " ");
		}
		
		
		System.out.println();
		System.out.println("================");
		
		for(int i=arr.length-1; i>=0; i--) {
			int num = arr[i];
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		double[] doubleArr = new double[10];
		for(int i=0; i<doubleArr.length; i++) {
			double num = doubleArr[i];
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		for(double num : doubleArr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		boolean[] boolArr = new boolean[4];
		for(int i=0; i<boolArr.length; i++) {
			boolean element = boolArr[i];
			System.out.print(element + " ");
		}
		
		System.out.println();
		for(boolean element : boolArr) {
			System.out.print(element + " ");
		}
	}
}
