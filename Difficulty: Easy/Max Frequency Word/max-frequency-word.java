class Solution {
	public String maximumFrequency(String s) {
		// Code here
		HashMap<String, Integer> map = new HashMap<>();
		
		String words[] = s.split(" ");
		
		for (String word:words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		
		String ans = words[0];
		int maxFreq = map.get(ans);
		
		for (String word:words) {
			int freq = map.get(word);
			
			if (freq>maxFreq) {
				ans = word;
				maxFreq = freq;
			}
			
		}
		
		return ans + " " + maxFreq;
	}
}
