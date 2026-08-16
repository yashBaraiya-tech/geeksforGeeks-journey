class Solution {
	public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
		// code here
		int rows = mat1.length;
		int common = mat1[0].length;
		int cols = mat2[0].length;
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>> ();
		int n = mat1.length;
		
		for (int i = 0; i < rows; i++) {
			ArrayList<Integer> tmp = new ArrayList<>();
			for (int j = 0; j < cols; j++) {
				// c[i][j] = ith row of a * jth col of b
				int sum = 0;
				for (int k = 0; k < common; k++) {
					sum += (mat1[i][k] * mat2[k][j]);
				}
				tmp.add(sum);
			}
			ans.add(tmp);
		}
		return ans;
	}
}
