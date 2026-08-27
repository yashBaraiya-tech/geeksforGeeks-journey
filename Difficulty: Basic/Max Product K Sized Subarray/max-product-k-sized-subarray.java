class Solution {
	public int findMaxProduct(int[] arr, int k) {
		// code here
		int prePro = 1;
		int n = arr.length;
		
		for (int i = 0; i<k; i++) {
			prePro *= arr[i];
		}
		
		int max = prePro;
		
		for (int i = 1; i <= n - k; i++) {
			int currPro = (prePro / arr[i - 1]) * arr[i + k - 1];
			max = Math.max(max, currPro);
			prePro = currPro;
		}
		
		return max;
	}
}
