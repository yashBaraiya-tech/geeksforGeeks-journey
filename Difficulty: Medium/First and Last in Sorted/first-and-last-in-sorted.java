class Solution {
	ArrayList<Integer> find(int arr[], int x) {
		// code here
		ArrayList<Integer> ans = new ArrayList<>();
		
		ans.add(firstPos(arr, x));
		ans.add(lastPos(arr, x));
		
		return ans;
		
	}
	
	static int firstPos(int arr[], int x) {
		int n = arr.length;
		
		int s = 0;
		int e = n - 1;
		int ans = -1;
		
		while (s <= e) {
			int mid = s + (e - s)/2;
			if (arr[mid] == x) {
				ans = mid;
				e = mid - 1;
			} else if (arr[mid]>x) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		
		return ans;
	}
	
	static int lastPos(int arr[], int x) {
		int n = arr.length;
		
		int s = 0;
		int e = n - 1;
		int ans = -1;
		
		while (s <= e) {
			int mid = s + (e - s)/2;
			if (arr[mid] == x) {
				ans = mid;
				s = mid + 1;
			} else if (arr[mid]>x) {
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		
		return ans;
	}
}
