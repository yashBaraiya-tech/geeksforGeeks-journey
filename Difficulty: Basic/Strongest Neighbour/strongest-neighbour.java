class Solution {
	public ArrayList<Integer> maxAdj(int[] arr) {
		// code here
		int n = arr.length;
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		ans.add(Math.max(arr[0], arr[1]));
		for (int i = 1; i<n - 1; i++) {
			ans.add(Math.max(arr[i], arr[i + 1]));
		}
		
		return ans;
	}
};
