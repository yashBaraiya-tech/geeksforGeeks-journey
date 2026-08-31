class Solution {
	boolean isPalindrome(String s) {
		// code here
		int i = 0;
		int j = s.length() - 1;
		
		while (i <= j) {
			char iChar = s.charAt(i);
			char jChar = s.charAt(j);
			
			if (iChar != jChar)
				return false;
			
			i++;
			j--;
		}
		
		return true;
	}
}
