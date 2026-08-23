class Solution {
	static int cubeRoot(int n) {
		// code here
		if (n <= 1)
			return n;
		long s = 1;
		long e = n;
		long ans = 0;
		
		while (s <= e) {
			
			long mid = s + (e - s) / 2;
			long cube = mid * mid * mid;
			
			if (cube == n) {
				return (int) mid;
			}
			else if (cube > n) {
				e = mid - 1;
			}
			else {
				ans = mid;
				s = mid + 1;
			}
		}
		
		return (int)ans;
		
	}
};
