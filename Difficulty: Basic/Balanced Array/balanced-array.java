class Solution {
	public int minValueToBalance(List<Integer> arr) {
		// code here
		int n = arr.size();
		int left = 0;
		int right = 0;
		int mid = n/2;
		int i = 0;
		
		while (i<mid) {
			left += arr.get(i);
			i++;
		}
		
		while (i<n) {
			right += arr.get(i);
			i++;
		}
		
		return Math.abs(left - right);
	}
};
