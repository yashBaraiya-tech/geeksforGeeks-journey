class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int minInx = -1;

            for (int j = i; j < n; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minInx = j;
                }
            }

            int tmp = arr[i];
            arr[i] = arr[minInx];
            arr[minInx] = tmp;
        }
    }
}