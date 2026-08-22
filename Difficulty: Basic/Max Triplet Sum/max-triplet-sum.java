class Solution {
	public int maxTripletSum(List<Integer> arr) {
		// Code Here
		Collections.sort(arr);
		
		int n = arr.size();
		int sum = 0;
		
		for (int i = 1; i <= 3; i++) {
			sum += arr.get(n - i);
		}
		
		return sum;
	}
}
