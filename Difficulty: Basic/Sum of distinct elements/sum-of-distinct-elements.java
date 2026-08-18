class Solution {
	int findSum(int[] arr) {
		// code here
		HashSet<Integer> set = new HashSet<>();
		int sum = 0;
		
		for (int x : arr) {
			set.add(x);
		}
		
		for (int e:set) {
			sum += e;
		}
		
		return sum;
	}
}
