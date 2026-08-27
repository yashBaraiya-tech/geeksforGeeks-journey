class Solution {
	public int[] countArray(int[] arr, int x) {
		// code here
		int n = arr.length;
		
		Map<Integer, Integer> freq = new HashMap<>();
		
		for (int num : arr) {
			freq.put(num, freq.getOrDefault(num, 0) + 1);
		}
		
		for (int i = 0; i<n; i++) {
			int avg = (arr[i] + x) / 2;
			arr[i] = freq.getOrDefault(avg, 0);
		}
		
		return arr;
	}
}
