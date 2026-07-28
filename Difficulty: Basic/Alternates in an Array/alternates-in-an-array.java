class Solution {
	public ArrayList<Integer> getAlternates(int arr[]) {
		// Code Here
		ArrayList<Integer> ls = new ArrayList<>();
		
		for (int i = 0; i<arr.length; i += 2) {
			ls.add(arr[i]);
		}
		return ls;
	}
}
