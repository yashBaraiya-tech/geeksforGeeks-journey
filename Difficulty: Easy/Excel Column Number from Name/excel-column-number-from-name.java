class Solution {
	public int excelColumnNumber(String s) {
		// code here
		int result = 0;
		
		for (char c : s.toCharArray()) {
			result = result * 26 + (c - 'A' + 1);
		}
		
		return result;
	}
}
