class Solution {
	public void rotate(int[] arr) {
		// code here
		int n = arr.length;
		rev(arr, 0, n - 1);
		rev(arr, 1, n - 1);
	
		
	}
	public void rev(int[] arr, int i, int j) {
		// code here
		while (i<j) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j--;
		}
	}
}
