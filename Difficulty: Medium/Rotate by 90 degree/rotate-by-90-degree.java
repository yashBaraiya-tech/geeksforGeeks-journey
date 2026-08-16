class Solution {
	public void rotateMatrix(int[][] mat) {
		// code here
		int rows = mat.length;
		int cols = mat[0].length;
		
		for (int i = 0; i < rows; i++) {
			for (int j = i + 1; j < cols; j++) {
				int tmp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = tmp;
			}
		}
		
		
		int top = 0;
		int bottom = rows - 1;
		
		while (top < bottom) {
			for (int j = 0; j < cols; j++) {
				int tmp = mat[top][j];
				mat[top][j] = mat[bottom][j];
				mat[bottom][j] = tmp;
			}
			
			top++;
			bottom--;
		}
	}
}
