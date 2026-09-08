class Solution {
	public ArrayList<String> possibleWords(int[] arr) {
		// code here
		ArrayList<String> ans = new ArrayList<>();
		StringBuilder output = new StringBuilder();
		
		int i = 0;
		String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		
		solve(ans, output, i, map, arr);
		return ans;
	}
	
	static void solve(ArrayList<String> ans, StringBuilder output, int i, String[] map, int[] arr) {
		
		if (i >= arr.length) {
			ans.add(output.toString());
			return;
		}
		
		int value = arr[i];
		
		if (value == 0 || value == 1) {
			solve(ans, output, i + 1, map, arr);
			return;
		}
		
		String mapped = map[value];
		
		for (int j = 0; j < mapped.length(); j++) {
			output.append(mapped.charAt(j));
			solve(ans, output, i + 1, map, arr);
			output.deleteCharAt(output.length() - 1);
		}
	}
}
