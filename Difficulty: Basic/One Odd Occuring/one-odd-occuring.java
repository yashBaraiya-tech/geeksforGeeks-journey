class Solution {
    // Method to find the element with odd occurrence in given array
    int getOddOccurrence(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result ^= num;
        }

        return result;
    }
}