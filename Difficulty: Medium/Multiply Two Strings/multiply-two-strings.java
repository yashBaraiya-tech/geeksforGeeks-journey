class Solution {
	public String multiplyStrings(String num1, String num2) {
		// Check signs
		boolean neg1 = num1.charAt(0) == '-';
		boolean neg2 = num2.charAt(0) == '-';
		
		if (neg1) {
			num1 = num1.substring(1);
		}
		
		if (neg2) {
			num2 = num2.substring(1);
		}
		
		// Remove leading zeros
		int p1 = 0;
		while (p1 < num1.length() && num1.charAt(p1) == '0') {
			p1++;
		}
		
		int p2 = 0;
		while (p2 < num2.length() && num2.charAt(p2) == '0') {
			p2++;
		}
		
		// One or both numbers are zero
		if (p1 == num1.length() || p2 == num2.length()) {
			return "0";
		}
		
		num1 = num1.substring(p1);
		num2 = num2.substring(p2);
		
		int l1 = num1.length();
		int l2 = num2.length();
		
		int[] result = new int[l1 + l2];
		
		// Multiply from right to left
		for (int i = l1 - 1; i >= 0; i--) {
			int digit1 = num1.charAt(i) - '0';
			int carry = 0;
			
			int k = i + l2;
			
			for (int j = l2 - 1; j >= 0; j--) {
				int digit2 = num2.charAt(j) - '0';
				
				int product = digit1 * digit2 + result[k] + carry;
				
				result[k] = product % 10;
				carry = product / 10;
				
				k--;
			}
			
			result[i] += carry;
		}
		
		// Convert result array to string
		StringBuilder ans = new StringBuilder();
		
		int i = 0;
		while (i < result.length && result[i] == 0) {
			i++;
		}
		
		while (i < result.length) {
			ans.append(result[i]);
			i++;
		}
		
		// Add negative sign if exactly one number is negative
		if (neg1 != neg2) {
			ans.insert(0, '-');
		}
		
		return ans.toString();
	}
}
