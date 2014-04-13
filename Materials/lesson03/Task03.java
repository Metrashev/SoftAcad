package less.lesson03;

public class Task03 {
	public static void main(String[] args) {
		int[] arr = {12, 15, 20, 10, 9, 5, 4};
		
		int[] arr2 = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[arr.length - 1 - i];
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		
		for(int i=0; i<arr.length/2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
		
		System.out.println();
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
