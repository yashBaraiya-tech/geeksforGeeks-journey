class Solution {
	public int findMinDiff(int arr[], int m) {
		// code here
		Arrays.sort(arr);
		int i = 0;
		int j = m - 1;
		int min = Integer.MAX_VALUE;
		while (j<arr.length) {
			int value = arr[j]-arr[i];
			min = Math.min(min, value);
			i++;
			j++;
			
		}
		
		return min;
	}
}
