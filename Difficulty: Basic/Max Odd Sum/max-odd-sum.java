class Solution {
	public int findMaxOddSum(int[] arr) {
		// code here
		long sum = 0;
		
		int smallestPositiveOdd = Integer.MAX_VALUE;
		int largestNegativeOdd = Integer.MIN_VALUE;
		
		for (int e:arr) {
			if (e>0) {
				sum += e;
				
				if (e%2 != 0) {
					smallestPositiveOdd = Math.min(smallestPositiveOdd, e);
				}
			}
			
			if (e < 0 && e % 2 != 0) {
				largestNegativeOdd = Math.max(largestNegativeOdd, e);
			}
		}
		
		if (sum%2 != 0)
			return (int) sum;
		
		long ans = -1;
		
		if (smallestPositiveOdd != Integer.MAX_VALUE) {
			ans = Math.max(ans, sum - smallestPositiveOdd);
		}
		
		if (largestNegativeOdd != Integer.MIN_VALUE) {
			ans = Math.max(ans, sum + largestNegativeOdd);
		}
		
		return (int)ans;
	}
}
