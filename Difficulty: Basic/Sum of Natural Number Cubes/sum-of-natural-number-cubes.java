class Solution {
	int sumOfSeries(int n) {
		// code here
		int ans = n*(n + 1)/2;
		ans *= ans;
		return ans;
	}
}
