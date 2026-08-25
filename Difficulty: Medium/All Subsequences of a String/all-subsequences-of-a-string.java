class Solution {
	public List<String> powerSet(String s) {
		// Code here
		List<String> ans = new ArrayList<>();
		StringBuilder output = new StringBuilder();
		int i = 0;
		
		solve(s, i, output, ans);
		Collections.sort(ans);
		return ans;
		
	}
	
	static void solve(String s, int i, StringBuilder output, List<String> ans) {
		
		if (i >= s.length()) {
			ans.add(output.toString());
			return;
		}
		
		char ch = s.charAt(i);
		
		// 		include
		output.append(ch);
		solve(s, i + 1, output, ans);
		
		// 		exclude
		output.deleteCharAt(output.length() - 1);
		solve(s, i + 1, output, ans);
	}
}
