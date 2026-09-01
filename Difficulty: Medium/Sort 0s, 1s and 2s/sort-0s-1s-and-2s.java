class Solution {
	public void sort012(int[] arr) {
		// code here
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		
		while (mid <= high) {
			if (arr[mid] == 0) {
				int tmp = arr[mid];
				arr[mid] = arr[low];
				arr[low] = tmp;
				mid++;
				low++;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				int tmp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = tmp;
				high--;
			}
		}
	}
}
