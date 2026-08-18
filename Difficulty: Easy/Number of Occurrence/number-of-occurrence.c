int countFreq(int arr[], int n, int target) {
	// code here
	
	int s = 0;
	int e = n - 1;
	int lower = n;
	int upper = n;
	
	while (s <= e) {
		int mid = s + (e - s)/2;
		if (arr[mid] >= target) {
			lower = mid;
			e = mid - 1;
		} else {
			s = mid + 1;
		}
	}
	
	s = 0;
	e = n - 1;
	
	while (s <= e) {
		int mid = s + (e - s)/2;
		if (arr[mid] <= target) {
			s = mid + 1;
		} else {
			upper = mid;
			e = mid - 1;
		}
	}
	
	return upper - lower;
}
