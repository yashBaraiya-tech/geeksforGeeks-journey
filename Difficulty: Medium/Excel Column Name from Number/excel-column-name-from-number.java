class Solution {
	public String colName(int n) {
		// code here
		StringBuilder ans = new StringBuilder();
		
		while (n>0) {
			n--;
			char c = (char)('A' + n%26);
			ans.append(c);
			n /= 26;
		}
		
		return ans.reverse().toString();
		
	}
}
