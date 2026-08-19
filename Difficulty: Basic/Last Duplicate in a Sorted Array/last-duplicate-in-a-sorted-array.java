class Solution {
	public int[] dupLastIndex(int[] arr) {
		// Complete the function
		int n = arr.length;
		
		int i = 0;
		int j = 1;
		
		int ans = -1;
		int ansIdx = -1;
		
		while (j<n) {
			if (arr[i] == arr[j]) {
				ans = arr[i];
				ansIdx = j;
			}
			i++;
			j++;
		}
		
		return new int[] {ansIdx, ans};
	}
}
