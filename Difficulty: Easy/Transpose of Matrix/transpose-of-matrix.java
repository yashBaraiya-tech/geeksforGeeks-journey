class Solution {
	public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
		// code here
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>> ();
	
		
		int row = mat.length;
		int col = mat[0].length;
		
		for (int j = 0; j < col; j++) {
			ArrayList<Integer> tmp = new ArrayList<>();
			for (int i = 0; i < row; i++) {
				tmp.add(mat[i][j]);
			}
			ans.add(tmp);
		}
		
		return ans;
	}
}
