class Solution {
	public void sortInWave(int arr[]) {
		// code here
		int n = arr.length;
		for (int i = 0; i<n-1; i=i+2) {
			int tmp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = tmp;
		}
	}
}
