class Solution {
	public void quickSort(int[] arr, int low, int high) {
		// code here
		
		if (low >= high) {
			return;
		}
		
		int pivotIdx = partition(arr, low, high);
		
		quickSort(arr, low, pivotIdx - 1);
		
		quickSort(arr, pivotIdx + 1, high);
		
	}
	
	private int partition(int[] arr, int low, int high) {
		// code here
		int count = 0;
		int pivot = arr[low];
		
		for (int i = low + 1; i <= high; i++) {
			if (arr[i] <= pivot) {
				count++;
			}
		}
		
		int correctIdx = low + count;
		
		int tmp = arr[low];
		arr[low] = arr[correctIdx];
		arr[correctIdx] = tmp;
		
		int i = low;
		int j = high;
		
		while (i<correctIdx && j>correctIdx) {
			
			while (arr[i] <= arr[correctIdx]) {
				i++;
			}
			
			while (arr[j] > arr[correctIdx]) {
				j--;
			}
			
			if (i<correctIdx && j>correctIdx) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
			
		}
		
		return correctIdx;
	}
}
