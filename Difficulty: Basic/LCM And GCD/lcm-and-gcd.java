class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int gcd = findGcd(a, b);
        int lcm = (a / gcd) * b;

        return new int[]{lcm, gcd};
    }

    static int findGcd(int a, int b) {
        if (b == 0)
            return a;

        return findGcd(b, a % b);
    }
}