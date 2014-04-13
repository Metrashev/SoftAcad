package less.lesson04;
public class Task02 {
	public static void main(String[] args) {
		int n = 7;
		int m = 12;
		
		int[][] matrix = new int[n][m];
		
		int num=1;
		for(int i=0; i<matrix[0].length; i++) {
			for(int j=0; j<matrix.length; j++) {
				if(i%2==0) {
					matrix[j][i] = num;
				} else {
					matrix[matrix.length - 1 - j][i] = num;
				}
				
				num++;
			}
		}
		
		for(int row=0; row<matrix.length; row++) {
			for(int col=0; col<matrix[0].length; col++) {
				System.out.print(matrix[row][col] + "\t");
			}
			System.out.println();
		}
	}
}
