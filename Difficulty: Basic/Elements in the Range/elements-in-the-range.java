class Solution {
	public boolean checkElements(int start, int end, int[] arr) {
		// code here
		ArrayList<Integer> num = new ArrayList<>();
		
		for (int e:arr) {
			num.add(e);
		}
		
		int i = start;
		
		while (i <= end) {
			if (!num.contains(i))
				return false;
				
				i++;
		}
		
		return true;
	}
}
