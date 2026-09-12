class Solution {
	ArrayList<Integer> findTwoElement(int arr[]) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		
		int n = arr.length;
		
		boolean flag[] = new boolean[n + 1];
		
		for (int e:arr) {
			if (!flag[e]) {
				flag[e] = true;
			} else {
				ans.add(e);
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if (flag[i] == false) {
				ans.add(i);
				break;
			}
		}
		
		return ans;
	}
}
