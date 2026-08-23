class Solution {
	
	static int fact(int n) {
		if (n <= 1)
			return 1;
		
		return n*fact(n - 1);
	}
	
	public boolean isStrong(int n) {
		// code here
		int sum = 0;
		int m = n;
		
		while (m != 0) {
			sum += fact(m%10);
			m /= 10;
		}
		
		return n == sum;
	}
}
