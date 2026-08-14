class Solution {
	int maxSubarraySum(int[] arr) {
		// Code here
		int sum = 0;
		int maxi = Integer.MIN_VALUE;
		int n = arr.length;
		
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			maxi = Math.max(sum, maxi);
			if (sum < 0)
				sum = 0;
		}
		return maxi;
	}
}
