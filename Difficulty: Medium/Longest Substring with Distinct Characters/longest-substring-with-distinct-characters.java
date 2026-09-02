class Solution {
	public int longestUniqueSubstr(String s) {
		// code here
		int i = 0;
		int j = 0;
		int count = 0;
		
		Set<Character> set = new HashSet<>();
		
		while (j<s.length()) {
			char ch = s.charAt(j);
			if (!set.contains(ch)) {
				set.add(ch);
				j++;
				count = Math.max(count, j - i);
				
			} else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		
		return count;
	}
}
