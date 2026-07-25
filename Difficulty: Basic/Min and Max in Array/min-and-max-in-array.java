class Solution {
	public ArrayList<Integer> getMinMax(int[] arr) {
		// code Here
		ArrayList<Integer> ans = new ArrayList<>();
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]<min)
				min = arr[i];
			if (arr[i]>max)
				max = arr[i];
		}
		
		ans.add(min);
		ans.add(max);
		
		return ans;
		
	}
}
