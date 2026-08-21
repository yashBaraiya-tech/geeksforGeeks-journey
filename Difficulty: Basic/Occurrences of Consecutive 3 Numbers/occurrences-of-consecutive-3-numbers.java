class Solution {
	public int specialIntegers(int[] arr) {
		// code here
		TreeSet<Integer> numbers = new TreeSet<>();
		int count = 0;
		
		for (int e:arr) {
			numbers.add(e);
		}
		
		for (int ele:numbers) {
			
			int left = ele - 1;
			int right = ele + 1;
			
			if (numbers.contains(left) && numbers.contains(right))
				count++;
		}
		
		return count;
	}
}
