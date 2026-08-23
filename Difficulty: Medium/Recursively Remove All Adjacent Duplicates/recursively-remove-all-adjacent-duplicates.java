class Solution {
	public String removeUtil(String s) {
		// code here
		if (s.length() <= 1)
			return s;
		
		StringBuilder sb = new StringBuilder();
		
		int n = s.length();
		boolean dup = false;
		
		for (int i = 0; i<=n-2; i++) {
			if (s.charAt(i) != s.charAt(i + 1) && dup == true) {
				dup = false;
			} else if (s.charAt(i) != s.charAt(i + 1)) {
				sb.append(s.charAt(i));
			} else {
				dup = true;
			}
		}
		if (dup == false)
			sb.append(s.charAt(n - 1));
		
		if (n == sb.length())
			return s;
		
		return removeUtil(sb.toString());
		
	}
}
