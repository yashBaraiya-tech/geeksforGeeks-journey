class Solution {
	
	static long lcm(long a, long b) {
		return (a / gcd(a, b)) * b;
	}
	
	static long gcd(long a, long b) {
		if (b == 0)
			return a;
		
		return gcd(b, a % b);
	}
	
	public static long getSmallestDivNum(int n) {
		long LCM = 1;
		
		for (int i = 1; i <= n; i++) {
			LCM = lcm(LCM, i);
		}
		
		return LCM;
	}
}
