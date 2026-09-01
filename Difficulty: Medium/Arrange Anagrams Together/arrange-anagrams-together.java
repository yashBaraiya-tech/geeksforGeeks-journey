class Solution {
	public ArrayList<ArrayList<String>> anagrams(String[] arr) {
		// code here
		Map<String, List<String> > map = new HashMap<>();
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		
		for (String str:arr) {
			char [] ca = str.toCharArray();
			
			Arrays.sort(ca);
			
			String key = new String(ca);
			
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<String>());
			}
			
			map.get(key).add(str);
		}
		
		for (List<String> list : map.values()) {
			ans.add(new ArrayList<>(list));
		}
		
		return ans;
	}
}
