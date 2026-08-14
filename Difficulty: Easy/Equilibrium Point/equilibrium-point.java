class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        leftSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftSum[i] = arr[i] + leftSum[i - 1];
        }

        rightSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = arr[i] + rightSum[i + 1];
        }

        for (int i = 0; i < n; i++) {
            if (leftSum[i] == rightSum[i])
                return i;
        }

        return -1;
    }
}
