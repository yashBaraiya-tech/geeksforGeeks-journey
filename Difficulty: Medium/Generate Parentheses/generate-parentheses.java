class Solution {
	public ArrayList<String> generateParentheses(int n) {
		// code here
		int left = n/2;
		int right = n/2;
		
		ArrayList<String> ans = new ArrayList<>();
		String output = "";
		
		solve(ans, output, left, right);
		return ans;
		
	}
	
	static void solve(ArrayList<String> ans, String output, int left, int right) {
		if (left == 0 && right == 0) {
			ans.add(output);
			return;
		}
		
		if (left>0) {
			solve(ans, output + "(", left - 1, right);
		}
		
		if (left<right) {
			solve(ans, output + ")", left, right - 1);
		}
	}
}
