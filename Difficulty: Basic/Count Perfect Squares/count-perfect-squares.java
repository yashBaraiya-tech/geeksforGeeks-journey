class Solution {
    static int countSquares(int n) {
        int count = 0;
        int i = 1;

        while (i * i < n) {
            count++;
            i++;
        }

        return count;
    }
}