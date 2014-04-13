package less.lesson04;

public class Task04 {
	public static void main(String[] args) {
		int n = 4;
		int m = 4;
		int num = 1;
		int[][] matrix = new int[n][m];
		
		int lStart = 0;
		int lEnd = matrix[0].length - 1;
		int tStart = 0;
		int tStop = matrix.length - 1;
		
//		for(;;) {
//			// Left -> Right (lStart -> lEnd)
//			// Top -> Bottom (tStart -> tEnd)
//			// Right -> Left (lEnd -> lStart)
//			// Bottom -> Top (tEnd -> tStart)
//		}
		
		
		for(int a=0; a<matrix.length; a++) {
			for(int b=0; b<matrix[0].length; b++) {
				System.out.print(matrix[a][b] + "\t");
			}
			System.out.println();
		}
	}
}
