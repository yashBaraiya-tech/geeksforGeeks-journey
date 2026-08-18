class Solution {
	public static ArrayList<Integer> reverseSubArray(ArrayList<Integer> arr, int l,
	int r) {
		// code here
		int i = l - 1;
		int j = r - 1;
		while (i<j) {
			int tmp = arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, tmp);
			i++;
			j--;
		}
		return arr;
	}
	
}
