class Complete {
	public static ArrayList<Integer> array(int a[][], int b[], int n) {
		// Complete the function
		ArrayList<Integer> ans = new ArrayList<>();
		int sum = 0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i<b.length; i++) {
			if (max<b[i])
				max = b[i];
		}
		
		for (int i = 0; i<a.length; i++) {
			sum += a[i][i];
		}
		
		ans.add(sum);
		ans.add(max);
		
		return ans;
	}
}
