class Solution {
	public int inversionCount(int arr[]) {
		// code here
		return mergeSort(arr, 0, arr.length - 1);
	}
	
	public int mergeSort(int arr[], int l, int r) {
		// code here
		int s = l;
		int e = r;
		
		if (s >= e)
			return 0;
		
		int mid = s + (e - s)/2;
		
		int leftCount = mergeSort(arr, s, mid);
		int rightCount = mergeSort(arr, mid + 1, e);
		int intermidiatCount = merge(arr, s, mid, e);
		
		return leftCount + rightCount + intermidiatCount;
		
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
