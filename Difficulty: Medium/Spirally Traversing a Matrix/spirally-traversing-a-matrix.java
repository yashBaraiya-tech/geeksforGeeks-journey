class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        int row = mat.length;
        int col = mat[0].length;

        int fc = 0;
        int lc = col - 1;
        int fr = 0;
        int lr = row - 1;

        while (fr <= lr && fc <= lc) {

            // Left to right
            for (int i = fc; i <= lc; i++) {
                ans.add(mat[fr][i]);
            }
            fr++;

            // Top to bottom
            for (int i = fr; i <= lr; i++) {
                ans.add(mat[i][lc]);
            }
            lc--;

            // Right to left
            if (fr <= lr) {
                for (int i = lc; i >= fc; i--) {
                    ans.add(mat[lr][i]);
                }
                lr--;
            }

            // Bottom to top
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    ans.add(mat[i][fc]);
                }
                fc++;
            }
        }

        return ans;
    }
}
