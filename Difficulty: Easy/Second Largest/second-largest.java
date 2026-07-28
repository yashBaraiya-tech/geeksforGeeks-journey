class Solution {
	public int getSecondLargest(int[] arr) {
		// code here
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		boolean flag = false;
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>max)
				max = arr[i];
		}
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>smax && arr[i] != max) {
				smax = arr[i];
				flag = true;
			}
			
		}
		
		if (flag)
			return smax;
		else
			return - 1;
	}
}
