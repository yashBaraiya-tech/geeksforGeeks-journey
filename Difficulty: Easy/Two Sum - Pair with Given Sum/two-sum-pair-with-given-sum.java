class Solution {
	boolean twoSum(int arr[], int target) {
		// code here
		// 		methos  1
		// 		int n = arr.length;
		// 		for (int i = 0; i<n - 1; i++) {
		// 			for (int j = i + 1; j<n; j++) {
		// 				if (arr[i]+arr[j] == target) {
		
		// 					return true;
		// 				}
		// 			}
		// 		}
		// 		return false;
		
		//      method 2
		Arrays.sort(arr);
		int i = 0, j = arr.length - 1;
		while (i<j) {
			if (arr[i]+arr[j] == target)
				return true;
			else if (arr[i]+arr[j]>target)
				j--;
			else
				i++;
		}
		return false;
	}
}
