class Solution {
    static ArrayList<String> findPermutation(String s) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        boolean[] used = new boolean[s.length()];

        solve(ans, output, s, used);

        return ans;
    }

    static void solve(ArrayList<String> ans, StringBuilder output,
                      String s, boolean[] used) {

        if (output.length() == s.length()) {
            ans.add(output.toString());
            return;
        }

        // Prevent duplicate choices at this level
        boolean[] seen = new boolean[256];

        for (int i = 0; i < s.length(); i++) {

            if (used[i])
                continue;

            char ch = s.charAt(i);

            // Same character already chosen at this level
            if (seen[ch])
                continue;

            seen[ch] = true;
            used[i] = true;
            output.append(ch);

            solve(ans, output, s, used);

            // Backtrack
            output.deleteCharAt(output.length() - 1);
            used[i] = false;
        }
    }
}