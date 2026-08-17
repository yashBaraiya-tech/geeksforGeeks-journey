class Solution {
	public int convertFive(int n) {
		// code here
		if (n == 0)
			return 5;
		int ans = n;
		int five = 5;
		while (n != 0) {
			int digit = n%10;
			if (digit == 0) {
				ans += five;
			}
			five *= 10;
			n /= 10;
		}
		return ans;
	}
}
