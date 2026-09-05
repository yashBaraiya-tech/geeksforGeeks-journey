class Solution {
	public boolean divisibleBy5(String n) {
		// code here
		char lastDigit = n.charAt(n.length() - 1);
		return lastDigit == '0' || lastDigit == '5';
		
	}
};
