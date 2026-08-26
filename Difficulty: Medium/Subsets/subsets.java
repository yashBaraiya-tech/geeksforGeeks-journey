class Solution {
	public ArrayList<ArrayList<Integer>> subsets(int nums[]) {
		// code here
		int i = 0;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		ArrayList<Integer> output = new ArrayList<>();
		
		solve(nums, i, output, ans);
		
		return ans;
	}
	
	static void solve(int[] nums, int i, ArrayList<Integer> output, ArrayList<ArrayList<Integer>> ans) {
		
		if (i >= nums.length) {
			ans.add(new ArrayList<>(output));
			return;
		}
		
		int currValue = nums[i];
		
		// include
		output.add(currValue);
		solve(nums, i + 1, output, ans);
		
		// backtraack
		output.remove(output.size() - 1);
		
		// exclude
		solve(nums, i + 1, output, ans);
		
	}
}
