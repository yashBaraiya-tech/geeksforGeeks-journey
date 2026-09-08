class Solution {
	public void mergeSort(int arr[], int l, int r) {
		// code here
		int s = l;
		int e = r;
		
		if (s >= e)
			return;
		
		int mid = s + (e - s)/2;
		
		mergeSort(arr, s, mid);
		mergeSort(arr, mid + 1, e);
		merge(arr, s, mid, e);
		
	}
	
	static int merge(int arr[], int s, int mid, int e) {
		int leftLen = mid - s + 1;
		int rightLen = e - mid;
		
		int leftArr [] = new int[leftLen];
		int rightArr [] = new int[rightLen];
		
		int k = s;
		for (int i = 0; i<leftLen; i++) {
			leftArr[i] = arr[k++];
		}
		
		k = mid + 1;
		for (int i = 0; i<rightLen; i++) {
			rightArr[i] = arr[k++];
		}
		
		int i = 0;
		int j = 0;
		k = s;
		int invCount = 0;
		
		while (i<leftLen && j<rightLen) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k++] = leftArr[i++];
			} else {
				arr[k++] = rightArr[j++];
				invCount += leftLen - i;
			}
		}
		
		while (i<leftLen) {
			arr[k++] = leftArr[i++];
		}
		
		while (j<rightLen) {
			arr[k++] = rightArr[j++];
		}
		
		return invCount;
	}
}
