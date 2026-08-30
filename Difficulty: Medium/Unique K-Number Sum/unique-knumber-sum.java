class Solution {
	
	static void solve(ArrayList<ArrayList<Integer>> ans, List<Integer> output, int i, int k, int n) {
		
		if (n == 0 && output.size() == k) {
			ans.add(new ArrayList<>(output));
			return;
		}
		
		if (i > 9 || output.size() > k || n < 0) {
			return;
		}
		
		// include
		output.add(i);
		solve(ans, output, i + 1, k, n - i);
		
		// backtrack
		output.remove(output.size() - 1);
		
		// exclude
		solve(ans, output, i + 1, k, n);
		
	}
	
	public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
		// code here
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		ArrayList<Integer> output = new ArrayList<>();
		
		int i = 1;
		solve(ans, output, i, k, n);
		return ans;
	}
}
