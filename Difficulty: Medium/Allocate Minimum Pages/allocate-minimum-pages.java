class Solution {
	
	static boolean isValid(int []arr, int k, long maxPage) {
		
		int count = 1;
		long page = 0;
		
		for (int i = 0; i<arr.length; i++) {
			if (page + arr[i] <= maxPage) {
				page += arr[i];
			} else {
				count ++;
				
				if (count>k || maxPage<arr[i]) {
					return false;
				} else {
					page = 0;
					page += arr[i];
				}
			}
		}
		
		return true;
	}
	
	public int findPages(int[] arr, int k) {
		// code here
		int n = arr.length;
		
		if (n<k)
			return - 1;
		
		long sum = 0;
		for (int e:arr) {
			sum += e;
		}
		
		long s = 1;
		long e = sum;
		
		long ans = e;
		
		while (s <= e) {
			long mid = s + (e - s)/2;
			
			if (isValid(arr, k, mid)) {
				e = mid - 1;
				ans = mid;
			} else {
				s = mid + 1;
			}
		}
		
		return (int)ans;
	}
}
