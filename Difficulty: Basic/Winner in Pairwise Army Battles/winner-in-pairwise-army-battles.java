class Solution {
	public String countryAtWar(int[] arr1, int[] arr2) {
		// code here
		int winA = 0;
		int winB = 0;
		
		for (int i = 0; i<arr1.length; i++) {
			if (arr1[i]>arr2[i])
				winA++;
			else if (arr1[i]<arr2[i])
				winB++;
		}
		
		if (winA>winB) {
			return "A";
		} else if (winA<winB) {
			return "B";
		} else {
			return "DRAW";
		}
	}
}
