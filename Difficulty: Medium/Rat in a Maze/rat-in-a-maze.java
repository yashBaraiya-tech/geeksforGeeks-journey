class Solution {
	public ArrayList<String> ratInMaze(int[][] maze) {
		// code here
		int n = maze.length;
		
		ArrayList<String> ans = new ArrayList<>();
		String path = "";
		boolean [][]visited = new boolean[n][n];
		
		int baseX = 0;
		int baseY = 0;
		
		int desX = n - 1;
		int desY = n - 1;
		
		if (maze[baseX][baseY] == 0) {
			return ans;
		}
		
		solve(maze, visited, baseX, baseY, desX, desY, ans, path, n);
		Collections.sort(ans);
		return ans;
	}
	
	static void solve(int[][] maze, boolean[][] visited, int baseX, int baseY, int desX, int desY, ArrayList<String> ans, String path, int n) {
		
		if (baseX == desX && baseY == desY) {
			ans.add(path);
			return;
		}
		
		visited[baseX][baseY] = true;
		
		// 		up
		int newX = baseX - 1;
		int newY = baseY;
		if (isValid(newX, newY, n, visited, maze)) {
			solve(maze, visited, newX, newY, desX, desY, ans, path + "U", n);
		}
		
		// down
		newX = baseX + 1;
		newY = baseY;
		if (isValid(newX, newY, n, visited, maze)) {
			solve(maze, visited, newX, newY, desX, desY, ans, path + "D", n);
		}
		
		// left
		newX = baseX;
		newY = baseY - 1;
		if (isValid(newX, newY, n, visited, maze)) {
			solve(maze, visited, newX, newY, desX, desY, ans, path + "L", n);
		}
		
		// right
		newX = baseX;
		newY = baseY + 1;
		if (isValid(newX, newY, n, visited, maze)) {
			solve(maze, visited, newX, newY, desX, desY, ans, path + "R", n);
		}
		
		// 		backtracking
		visited[baseX][baseY] = false;
		
	}
	
	static boolean isValid(int x, int y, int n, boolean[][] visited, int[][] maze) {
		if (x < 0 || x >= n || y < 0 || y >= n) {
			return false;
		}
		
		if (visited[x][y]) {
			return false;
		}
		
		if (maze[x][y] == 0) {
			return false;
		}
		
		return true;
	}
}
