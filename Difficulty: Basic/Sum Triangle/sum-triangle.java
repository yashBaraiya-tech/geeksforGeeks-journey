class Solution {
	public ArrayList<Integer> getTriangle(int[] arr) {
		// code here
		ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
		
		ArrayList<Integer> current = new ArrayList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		
		for (int e:arr) {
			current.add(e);
		}
		rows.add(current);
		
		while (current.size()>1) {
			ArrayList<Integer> next = new ArrayList<>();
			
			for (int i = 0; i<current.size() - 1; i++) {
				next.add(current.get(i) + current.get(i + 1));
			}
			
			current = next;
			rows.add(current);
		}
		
		for (int i = rows.size() - 1; i >= 0; i--) {
			ans.addAll(rows.get(i));
		}
		
		return ans;
	}
}
