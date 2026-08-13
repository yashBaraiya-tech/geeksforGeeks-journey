class Solution {
	void segregate0and1(int[] arr) {
		// code here
		
		// 		method 1
		// 		int zero = 0, one = 0;
		// 		for (int i = 0; i<arr.length; i++) {
		// 			if (arr[i] == 0)
		// 				zero++;
		// 			else
		// 				one++;
		// 		}
		
		// 		int i = 0;
		// 		while (zero != 0) {
		// 			arr[i] = 0;
		// 			i++;
		// 			zero--;
		// 		}
		// 		while (one != 0) {
		// 			arr[i] = 1;
		// 			i++;
		// 			one--;
		// 		}
		
		// method 2
		int i = 0;
		int j = arr.length - 1;
		while (i<j) {
			if (arr[i] == 1 && arr[j] == 0) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			} else if (arr[i] == 0) {
				i++;
			} else {
				j--;
			}
		}
	}
}
