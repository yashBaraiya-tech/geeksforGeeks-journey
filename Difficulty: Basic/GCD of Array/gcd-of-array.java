class Solution {
	public int gcd(int n, int arr[]) {
		// code here.
		int ansGCD = arr[0];
		
		for (int i = 1; i<arr.length; i++) {
			ansGCD = GCD(arr[i], ansGCD);
		}
		
		return ansGCD;
		
	}
	
	public int GCD(int a, int b) {
		if (b == 0)
			return a;
		
		return GCD(b, a % b);
	}
}
