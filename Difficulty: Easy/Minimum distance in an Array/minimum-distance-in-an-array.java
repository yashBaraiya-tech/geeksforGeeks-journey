class Solution {
	int minDist(int arr[], int x, int y) {
		// code here
		int xIdx = -1;
		int yIdx = -1;
		
		int minDist = Integer.MAX_VALUE;
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i] == x)
				xIdx = i;
			else if (arr[i] == y)
				yIdx = i;
			
			if (xIdx != -1 && yIdx != -1) {
				int dist = Math.abs(xIdx - yIdx);
				minDist = Math.min(minDist, dist);
			}
			
		}
		
		if (xIdx == -1 || yIdx == -1)
			return - 1;
		
		return minDist;
	}
}
