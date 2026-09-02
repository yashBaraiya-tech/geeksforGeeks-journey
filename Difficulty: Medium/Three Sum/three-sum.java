class Solution {
	public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
		// code here
		Arrays.sort(arr);
		int n = arr.length;
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		
		for (int i = 0; i<n - 2; i++) {
			if (i>0 && arr[i] == arr[i - 1])
				continue;
			
			int j = i + 1;
			int k = n - 1;
			
			while (j<k) {
				int sum = arr[i]+arr[j]+arr[k];
				if (sum == 0) {
					ans.add(new ArrayList<>(
					Arrays.asList(arr[i], arr[j], arr[k])
					));
					
					while (j < k && arr[j] == arr[j + 1]) {
						j++;
					}
					while (j < k && arr[k] == arr[k - 1]) {
						k--;
					}
					j++;
					k--;
				} else if (sum<0) {
					j++;
				} else {
					k--;
				}
			}
		}
		
		return ans;
	}
}
