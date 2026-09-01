class Solution {
	public static int intersectSize(int a[], int b[]) {
		// Your code here
		int ans = 0;
		
		Set<Integer> set = new HashSet<>();
		
		for (int e : a) {
			set.add(e);
		}
		
		for (int e : b) {
			if (set.contains(e)) {
				set.remove(e);
				ans++;
			}
		}
		
		return ans;
	}
}
