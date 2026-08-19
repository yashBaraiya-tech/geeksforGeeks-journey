class Solution {
	public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		
		int i = 0;
		int j = 0;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		while (i<arr1.length && j<arr2.length) {
			if (arr1[i] == arr2[j]) {
				ans.add(arr1[i]);
				i++;
				j++;
			} else if (arr1[i]<arr2[j]) {
				ans.add(arr1[i]);
				i++;
			} else {
				ans.add(arr2[j]);
				j++;
			}
		}
		
		while (i<arr1.length) {
			ans.add(arr1[i]);
			i++;
		}
		
		while (j<arr2.length) {
			ans.add(arr2[j]);
			j++;
		}
		
		return ans;
	}
}
