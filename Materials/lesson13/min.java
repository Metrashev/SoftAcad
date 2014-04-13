package less.lesson13;

public class min {
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = i+1 + matrix.length * j;

			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[0][0] = 4;
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}