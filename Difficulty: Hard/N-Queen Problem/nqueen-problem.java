class Solution {
	public ArrayList<ArrayList<Integer>> nQueen(int n) {
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		char[][] board = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			Arrays.fill(board[i], '.');
		}
		
		int colIdx = 0;
		
		solve(ans, board, colIdx, n);
		
		return ans;
	}
	
	static void solve(ArrayList<ArrayList<Integer>> ans,
	char[][] board, int colIdx, int n) {
		
		if (colIdx >= n) {
			
			ArrayList<Integer> tmp = new ArrayList<>();
			
			// We placed queens column-wise.
			// For every row, find the column containing Q.
			for (int row = 0; row < n; row++) {
				for (int col = 0; col < n; col++) {
					if (board[row][col] == 'Q') {
						tmp.add(col + 1);
						break;
					}
				}
			}
			
			ans.add(tmp);
			return;
		}
		
		for (int rowIdx = 0; rowIdx < n; rowIdx++) {
			
			if (isSafe(rowIdx, colIdx, n, board)) {
				
				board[rowIdx][colIdx] = 'Q';
				
				solve(ans, board, colIdx + 1, n);
				
				// Backtrack
				board[rowIdx][colIdx] = '.';
			}
		}
	}
	
	static boolean isSafe(int rowIdx, int colIdx,
	int n, char[][] board) {
		
		// Left
		int row = rowIdx;
		int col = colIdx - 1;
		
		while (col >= 0) {
			if (board[row][col] == 'Q') {
				return false;
			}
			col--;
		}
		
		// Upper-left
		row = rowIdx - 1;
		col = colIdx - 1;
		
		while (row >= 0 && col >= 0) {
			if (board[row][col] == 'Q') {
				return false;
			}
			row--;
			col--;
		}
		
		// Lower-left
		row = rowIdx + 1;
		col = colIdx - 1;
		
		while (row < n && col >= 0) {
			if (board[row][col] == 'Q') {
				return false;
			}
			row++;
			col--;
		}
		
		return true;
	}
}
