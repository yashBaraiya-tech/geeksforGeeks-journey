class Solution {
	public void solveSudoku(int[][] mat) {
		// code here
		solve(mat);
	}
	
	static boolean solve(int [][] mat) {
		
		int [] empty = new int[2];
		
		if (!findEmpty(mat, empty)) {
			return true;
		}
		
		int rowIdx = empty[0];
		int colIdx = empty[1];
		
		for (int value = 1; value <= 9; value++) {
			if (isSafe(value, rowIdx, colIdx, mat)) {
				mat[rowIdx][colIdx] = value;
				
				if (solve(mat) == true) {
					return true;
				}
				mat[rowIdx][colIdx] = 0;
			}
		}
		
		return false;
		
	}
	
	static boolean findEmpty(int [][]mat, int []empty) {
		for (int i = 0; i<9; i++) {
			for (int j = 0; j<9; j++) {
				if (mat[i][j] == 0) {
					empty[0] = i;
					empty[1] = j;
					return true;
				}
			}
		}
		
		return false;
	}
	
	static boolean isSafe(int value, int rowIdx, int colIdx, int [][]mat) {
		// 		col
		for (int col = 0; col<9; col++) {
			if (mat[rowIdx][col] == value)
				return false;
		}
		
		// row
		for (int row = 0; row<9; row++) {
			if (mat[row][colIdx] == value)
				return false;
		}
		
		// subMatrix 3x3
		int startRow = rowIdx - rowIdx%3;
		int startCol = colIdx - colIdx%3;
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				int actualRow = startRow + i;
				int actualCol = startCol + j;
				
				if (mat[actualRow][actualCol] == value)
					return false;
			}
		}
		
		return true;
		
	}
}
