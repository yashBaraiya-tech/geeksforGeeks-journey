class Solution {
	public int longestConsecutive(int[] arr) {
		// code here
		if (arr.length == 0)
			return 0;
		
		Set<Integer> set = new HashSet<>();
		
		for (int e:arr) {
			set.add(e);
		}
		
		int maxLength = 0;
		
		for (int num:set) {
			if (!set.contains(num - 1)) {
				int c = num;
				int len = 1;
				
				while (set.contains(c + 1)) {
					len++;
					c++;
				}
				
				maxLength = Math.max(maxLength, len);
			}
		}
		
		return maxLength;
	}
}
