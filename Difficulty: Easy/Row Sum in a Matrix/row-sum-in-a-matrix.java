class Solution {
	public static int[] rowSum(int mat[][]) {
		// Code here
		int row = mat.length;
		int col = mat[0].length;
		int ans[] = new int[row];
		
		for (int i = 0; i<row; i++) {
			for (int j = 0; j<col; j++) {
				ans[i] += mat[i][j];
			}
		}
		
		return ans;
	}
}
