class Solution {
    public int countCoPrime(int[] arr) {
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (gcd(arr[i - 1], arr[i]) != 1) {
                count++;
            }
        }

        return count;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}