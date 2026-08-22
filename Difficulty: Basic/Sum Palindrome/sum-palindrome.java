class Solution {
	static int isSumPalindrome(int n) {
		// code here
		int i = 0;
		while (i<=5) {
			
			if (isPalindrome(n))
				return n;
			else
				n += reverse(n);
			
			i++;
		}
		
		return - 1;
		
	}
	
	static boolean isPalindrome(int n) {
		// code here
		int rev = reverse(n);
		
		if (rev == n)
			return true;
		else
			return	false;
	}
	
	static int reverse(int n) {
		// code here
		int rev = 0;
		
		while (n != 0) {
			rev *= 10;
			rev += n%10;
			n /= 10;
		}
		
		return rev;
	}
	
}
