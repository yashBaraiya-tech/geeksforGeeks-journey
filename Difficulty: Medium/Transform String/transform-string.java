class Solution {
	int transform(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
			return - 1;
		}
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		int n = s1.length();
		
		for (int i = 0; i < n; i++) {
			m.put(s1.charAt(i), m.getOrDefault(s1.charAt(i), 0) + 1);
		}
		
		for (int i = 0; i < n; i++) {
			m.put(s2.charAt(i), m.getOrDefault(s2.charAt(i), 0) - 1);
		}
		
		for (int count:m.values()) {
			if (count != 0)
				return - 1;
		}
		
		int i = n - 1, j = n - 1;
		int res = 0;
		
		while (i >= 0 && j >= 0) {
			if (s1.charAt(i) == s2.charAt(j)) {
				i--;
				j--;
			} else {
				i--;
			}
			
		}
		return j + 1;
		
	}
}
