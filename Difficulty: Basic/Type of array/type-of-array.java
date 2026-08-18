class Solution {
    int typeOfArr(int arr[]) {
        int n = arr.length;
        int ascBreak = 0;
        int descBreak = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascBreak++;
            }

            if (arr[i] < arr[i + 1]) {
                descBreak++;
            }
        }

        if (ascBreak == 0) {
            return 1; // ascending
        }

        if (descBreak == 0) {
            return 2; // descending
        }

        if (ascBreak == 1 && arr[n - 1] < arr[0]) {
            return 4; // ascending rotated
        }

        if (descBreak == 1 && arr[n - 1] > arr[0]) {
            return 3; // descending rotated
        }

        return -1;
    }
}