class Solution {
	public boolean isValid(int board[][]) {
		// code here
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != 0) {
					int value = board[i][j];
					int rowIdx = i;
					int colIdx = j;
					
					if (!isValid(value, board, rowIdx, colIdx)) {
						return false;
					}
				}
			}
		}
		
		return true;
		
	}
	
	static boolean isValid(int value, int[][] board, int rowIdx, int colIdx) {
		// col
		for (int col = 0; col < 9; col++) {
			if (col != colIdx && board[rowIdx][col] == value) {
				return false;
			}
		}
		
		// row
		for (int row = 0; row < 9; row++) {
			if (row != rowIdx && board[row][colIdx] == value) {
				return false;
			}
		}
		
		// subMatrix
		int startRow = rowIdx - rowIdx % 3;
		int startCol = colIdx - colIdx % 3;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int actualRow = startRow + i;
				int actualCol = startCol + j;
				
				if ((actualRow != rowIdx || actualCol != colIdx)
					 && board[actualRow][actualCol] == value) {
					return false;
				}
			}
		}
		
		return true;
	}
}
