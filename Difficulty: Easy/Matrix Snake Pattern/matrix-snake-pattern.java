class Solution {
	static ArrayList<Integer> snakePattern(int matrix[][]) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		for (int i = 0; i < rows; i++) {
			if (i % 2 == 0)
				for (int j = 0; j < cols; j++) {
				ans.add(matrix[i][j]);
			}
			else
				for (int j = cols - 1; j >= 0; j--) {
				ans.add(matrix[i][j]);
			}
			
		}
		return ans;
	}
}
