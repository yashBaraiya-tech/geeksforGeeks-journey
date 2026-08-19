class Solution {
	public static ArrayList<Integer> valEqualToPos(int[] arr) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		
		int n = arr.length;
		
		for (int i = 0; i<n; i++) {
			if (arr[i] == i + 1)
				ans.add(i + 1);
		}
		
		return ans;
	}
}
