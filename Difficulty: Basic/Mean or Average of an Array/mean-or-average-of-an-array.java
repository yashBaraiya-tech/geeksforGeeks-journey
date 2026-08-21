class Solution {
	public static int findMean(int[] arr) {
		// code here
		int sum = 0;
		int n = arr.length;
		
		for (int e:arr) {
			sum += e;
		}
		
		// 		int avg = Math.floor(sum/n);
		
		return sum/n;
	}
};
