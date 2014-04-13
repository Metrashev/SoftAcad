package less.lesson03;

public class ArraysDemo {
	public static void main(String[] args) {
		int[] arr1;
		int arr2[];
		
		arr1 = new int[5];
		arr2 = new int[20];
		
		int[] arr3 = new int[10];
		
		double[] arr4 = new double[24];
		
		System.out.println(arr1[0]);
		arr1[0] = 34;
		arr1[1] = 7;
		arr1[2] = 4;
		arr1[3] = 19;
		arr1[4] = 44;
		//arr1[5] = 50;
		
		System.out.println(arr1[2]);
		
		System.out.println(arr4[2]);
		
		byte[] arr5 = {3, 7, 12};
		System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		//System.out.println(arr5[3]);
		
		System.out.println("len: " + arr5.length);
	}
}
