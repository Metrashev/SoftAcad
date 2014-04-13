package less.lesson04;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter n: ");
//		int n = s.nextInt();
//		System.out.print("Enter m: ");
//		int m = s.nextInt();
		
		int n = 7;
		int m = 12;
		
		int[][] matrix = new int[n][m];
		
//		int num=1;
//		for(int i=0; i<matrix[0].length; i++) {
//			for(int j=0; j<matrix.length; j++) {
//				matrix[j][i] = num;
//				num++;
//			}
//		}
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				matrix[i][j] = i+1 + matrix.length * j;
			}
		}
		
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
