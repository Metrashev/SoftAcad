
package less.lesson03;

public class Task04 {
	public static void main(String[] args) {
		int[] arr = {9, 2, 4, -3, 7, 5};
		int[] arr2 = new int[arr.length + 1];
		
		arr2[0] = arr.length;
		for(int i=1; i<arr2.length; i++) {
			arr2[i] = arr[i-1] * i;
		}
		
		for (int i : arr2) {
			System.out.print(i + " ");
		}
	}
}
