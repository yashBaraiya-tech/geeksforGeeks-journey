class Solution {
	public void mergeArrays(int a[], int b[]) {
		// code here
		int i = 0;
		int j = 0;
		int k = a.length - 1;
		
		while (i<=k && j<b.length ) {
			if (a[i]<b[j]) {
				i++;
				continue;
			} else {
				int tmp = a[k];
				a[k] = b[j];
				b[j] = tmp;
				k--;
				j++;
			}
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
	}
}
