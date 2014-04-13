package less.lesson04;

public class Task03 {
	public static void main(String[] args) {
		int n = 7;
		int m = 12;
		int num = 1;
		
		int[][] matrix = new int[n][m];
		int i = matrix.length - 1;
		int j = 0;
		
		while(j <= matrix[0].length - 1) {
			int ii = i;
			int jj = j;
			while(ii <= matrix.length - 1 && jj <= matrix[0].length - 1) {
				matrix[ii][jj] = num;
				num++;
				ii++;
				jj++;
			}
			
			if(i != 0) {
				i--;
			} else {
				j++;
			}
		}
			
		for(int a=0; a<matrix.length; a++) {
			for(int b=0; b<matrix[0].length; b++) {
				System.out.print(matrix[a][b] + "\t");
			}
			System.out.println();
		}
	}
}
