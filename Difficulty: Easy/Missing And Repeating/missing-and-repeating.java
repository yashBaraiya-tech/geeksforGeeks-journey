class Solution {
	ArrayList<Integer> findTwoElement(int arr[]) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		int n = arr.length;
		for (int i = 0; i<n; i++) {
			int val = Math.abs(arr[i]);
			int position = val - 1;
			
			if (arr[position]>0) {
				arr[position] = -arr[position];
			} else {
				ans.add(val);
			}
		}
		
		for (int i = 0; i<n; i++) {
			if (arr[i]>0) {
				ans.add(i + 1);
			}
		}
		
		return ans;
	}
}
