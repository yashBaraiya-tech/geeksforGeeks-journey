class Solution {
	public ArrayList<Integer> xorArray(int[] arr) {
		// code here
		int n = arr.length;
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int i = 0; i<n - 1; i++) {
			ans.add(arr[i]^arr[i + 1]);
		}
		ans.add(arr[n - 1]);
		
		return ans;
	}
}
