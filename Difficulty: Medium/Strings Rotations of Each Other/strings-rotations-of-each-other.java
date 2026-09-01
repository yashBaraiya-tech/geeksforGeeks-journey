class Solution {
    public boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        String rotated = s1 + s1;

        int n = s2.length();
        int[] lps = new int[n];

        // Build LPS array
        int len = 0;
        int i = 1;

        while (i < n) {
            if (s2.charAt(i) == s2.charAt(len)) {
                lps[i] = len + 1;
                len++;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // Search s2 inside rotated
        i = 0;
        int j = 0;

        while (i < rotated.length()) {
            if (rotated.charAt(i) == s2.charAt(j)) {
                i++;
                j++;

                if (j == n)
                    return true;
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return false;
    }
}