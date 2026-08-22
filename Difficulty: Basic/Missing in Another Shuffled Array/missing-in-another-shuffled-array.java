class Solution {
	public int findMissing(int[] arr1, int[] arr2) {
		// code here
		int sum1 = 0;
		int sum2 = 0;
		
		for (int e:arr1) {
			sum1 += e;
		}
		for (int e:arr2) {
			sum2 += e;
		}
		
		return sum1 - sum2;
	}
}
