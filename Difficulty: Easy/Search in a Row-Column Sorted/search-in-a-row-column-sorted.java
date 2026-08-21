class Solution {
    public static boolean matSearch(int matrix[][], int target) {
        // code here
        int row = matrix.length;
        int col = matrix[0].length;

        int curRow = 0;
        int curCol = col - 1;

        while (curRow < row && curCol >= 0) {
            if (matrix[curRow][curCol] == target) {
                return true;
            } else if (matrix[curRow][curCol] > target) {
                curCol--;
            } else {
                curRow++;
            }
        }

        return false;
    }
}