class Solution {
	public long[] findElements(long arr[]) {
		// code here
		Arrays.sort(arr);
		
		long ans[] = new long[arr.length - 2];
		
		for (int i = 0; i<arr.length - 2; i++) {
			ans[i] = arr[i];
		}
		
		return ans;
	}
}
