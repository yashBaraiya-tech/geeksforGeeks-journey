class Solution {
	public int findMin(int[] arr) {
		// code here
		int n = arr.length;
		
		int s = 0;
		int e = n - 1;
		
		int pivot = -1;
		
		while (s <= e) {
			int mid = s + (e - s)/2;
			
			if (arr[mid] <= arr[n - 1]) {
				e = mid - 1;
			} else {
				pivot = mid;
				s = mid + 1;
			}
		}
		
		return pivot == n - 1?arr[0]:arr[pivot + 1];
	}
}
