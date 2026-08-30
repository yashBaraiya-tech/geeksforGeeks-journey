class Solution {
	public int countWords(String s) {
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if (c >= 'a' && c <= 'z' &&
			(i == 0 || s.charAt(i - 1) == ' ' ||
			s.charAt(i - 1) == '\t' ||
			s.charAt(i - 1) == '\n')) {
				count++;
			}
		}
		
		return count;
	}
}
