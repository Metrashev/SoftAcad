package less.lesson03;
public class MatrixDemo {
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		
		int num = 1;
		for(int row=0; row<matrix.length; row++) {
			for(int col=0; col<matrix[row].length; col++) {
				matrix[col][row] = num;
				num++;
			}
		}
		
		for(int row=0; row<matrix.length; row++) {
			for(int col=0; col<matrix[row].length; col++) {
				System.out.print(matrix[row][col] + "\t");
			}
			System.out.println();
		}
	}
}
