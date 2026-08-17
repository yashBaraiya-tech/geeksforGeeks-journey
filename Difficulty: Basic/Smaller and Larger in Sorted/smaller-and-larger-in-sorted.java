class Solution {
	int[] getMoreAndLess(int[] arr, int target) {
		// code here
		int small = 0;
		int big = 0;
		int n = arr.length;
		
		for (int i = 0; i<n; i++) {
			if (arr[i] <= target)
				small++;
			if (arr[i] >= target)
				big++;
		}
		
		return new int[] {small, big};
	}
}
