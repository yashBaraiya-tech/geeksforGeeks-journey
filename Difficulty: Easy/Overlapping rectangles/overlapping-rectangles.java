class Solution {
	int doOverlap(int L1[], int R1[], int L2[], int R2[]) {
		// code here
		
		int left = Math.max(L1[0], L2[0]);
		int right = Math.min(R1[0], R2[0]);
		
		int bottom = Math.max(R1[1], R2[1]);
		int top = Math.min(L1[1], L2[1]);
		
		if (left <= right && bottom <= top) {
			return 1;
		}
		
		return 0;
		
	}
};
