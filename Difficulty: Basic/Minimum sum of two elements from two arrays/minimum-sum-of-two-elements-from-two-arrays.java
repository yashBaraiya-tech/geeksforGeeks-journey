class Solution {
	public int minSum(int[] arr1, int[] arr2) {
		
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int index1 = -1;
		
		// Find smallest and second smallest in arr1
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < min1) {
				min2 = min1;
				min1 = arr1[i];
				index1 = i;
			} else if (arr1[i] < min2) {
				min2 = arr1[i];
			}
		}
		
		int min3 = Integer.MAX_VALUE;
		int min4 = Integer.MAX_VALUE;
		int index2 = -1;
		
		// Find smallest and second smallest in arr2
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] < min3) {
				min4 = min3;
				min3 = arr2[i];
				index2 = i;
			} else if (arr2[i] < min4) {
				min4 = arr2[i];
			}
		}
		
		// If smallest elements have different indexes
		if (index1 != index2) {
			return min1 + min3;
		}
		
		// Same index, so use second smallest
		return Math.min(min1 + min4, min2 + min3);
	}
}
