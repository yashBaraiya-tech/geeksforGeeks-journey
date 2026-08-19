class Solution {
	
	static boolean isValid(int arr[], int k, long maxLength) {
		int count = 1;
		long length = 0;
		
		for (int i = 0; i<arr.length; i++) {
			if (length + arr[i] <= maxLength) {
				length += arr[i];
			} else {
				count++;
				length = 0;
				
				if (count>k || arr[i]>maxLength) {
					return false;
				} else {
					length += arr[i];
				}
			}
		}
		
		return true;
	}
	
	public int minTime(int[] arr, int k) {
		// code here
		long sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		long s = 1;
		long e = sum;
		long ans = e;
		
		while (s <= e) {
			long mid = s + (e - s)/2;
			if (isValid(arr, k, mid)) {
				ans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		
		return (int)ans;
	}
}
