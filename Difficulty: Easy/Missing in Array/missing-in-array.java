class Solution {
	int missingNum(int arr[]) {
		// code here
		long n = arr.length + 1;
		long originalSum = n*(n + 1)/2;
		long arrSum = 0;
		
		for (long e:arr) {
			arrSum += e;
		}
		
		return (int)(originalSum - arrSum);
	}
}
