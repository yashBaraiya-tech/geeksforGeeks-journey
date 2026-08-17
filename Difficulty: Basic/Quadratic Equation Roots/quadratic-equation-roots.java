class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> ans = new ArrayList<>();

        int d = b * b - 4 * a * c;

        if (d < 0) {
            ans.add(-1);
            return ans;
        }

        int root1 = (int) Math.floor((-b + Math.sqrt(d)) / (2.0 * a));
        int root2 = (int) Math.floor((-b - Math.sqrt(d)) / (2.0 * a));

        ans.add(Math.max(root1, root2));
        ans.add(Math.min(root1, root2));

        return ans;
    }
}