class Solution {
	public static boolean isPalinArray(int[] arr) {
		// code here.
		
		for (int i = 0; i<arr.length; i++) {
			boolean flag = isPalinNumber(arr[i]);
			
			if (!flag)
				return false;
		}
		return true;
	}
	
	public static boolean isPalinNumber(int a) {
		int original = a;
		int reverse = 0;
		
		while (a != 0) {
			reverse = reverse * 10 + a % 10;
			a /= 10;
		}
		
		return original == reverse;
	}
}
