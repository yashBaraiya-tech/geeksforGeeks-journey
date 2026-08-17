class Solution {
	void pushZerosToEnd(int[] a) {
		// code here
		int n = a.length;
		int j = 0;
		
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				if (i != j) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				j++;
			}
		}
	}
}
