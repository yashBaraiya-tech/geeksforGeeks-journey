class Solution {
	public ArrayList<Integer> gfSeries(int n) {
		ArrayList<Integer> ans = new ArrayList<>();
		
		ans.add(0);
		ans.add(1);
		
		generate(ans, n);
		
		return ans;
	}
	
	private void generate(ArrayList<Integer> ans, int n) {
		if (ans.size() == n) {
			return;
		}
		
		int size = ans.size();
		int next = (ans.get(size - 2) * ans.get(size - 2)) - ans.get(size - 1);
		
		ans.add(next);
		
		generate(ans, n);
	}
}
