class Solution {
	public int kokoEat(int[] arr, int k) {
		// code here
		int n = arr.length;
		
		int max = Integer.MIN_VALUE;
		
		for (int e:arr) {
			if (e>max)
				max = e;
		}
		
		int s = 1;
		int e = max;
		int ans = 0;
		
		while (s <= e) {
			int mid = s + (e - s)/2;
			
			if (isPossible(arr, k, mid)) {
				ans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		
		return ans;
		
	}
	
	static boolean isPossible(int[] arr, int k, int mid) {
		// int result = (n + d - 1) / d;
		int n = arr.length;
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			result += (arr[i] + mid - 1) / mid;
			if (result > k)
				return false;
		}
		
		return true;
	}
}
