class Solution {
	public void rotateArr(int arr[], int d) {
		// code here
		int n = arr.length;
		d = d % n;
		reverse(0, d - 1, arr);
		reverse(d, n - 1, arr);
		reverse(0, n - 1, arr);
	}
	
	public static void reverse(int i, int j, int a[]) {
		while (i < j) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
			i++;
			j--;
		}
	}
}
