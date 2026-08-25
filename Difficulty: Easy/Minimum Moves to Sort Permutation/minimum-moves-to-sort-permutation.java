class Solution {
	public int minMoves(int[] arr) {
		// code here
		int current = 1;
		int max = 1;
		int n = arr.length;
		
		int pos[] = new int[n + 1];
		
		for (int i = 0; i<n; i++) {
			pos[arr[i]] = i;
		}
		
		for (int i = 2; i<pos.length; i++) {
			if (pos[i]>pos[i - 1]) {
				current++;
			} else {
				current = 1;
			}
			
			max = Math.max(max, current);
		}
		
		return n - max;
		
	}
}
