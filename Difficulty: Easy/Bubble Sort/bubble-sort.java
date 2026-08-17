class Solution {
	public void bubbleSort(int[] arr) {
		// code here
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean isSorted = true;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					isSorted = false;
				}
			}
			if (isSorted)
				break;
		}
	}
}
