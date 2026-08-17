class Solution {
    // Please change the array in-place
    public void insertionSort(int a[]) {
        // code here
        

        for (int i = 1; i < a.length; i++) {
            int j = i;

            while (j > 0 && a[j] < a[j - 1]) {
                int tmp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = tmp;
                j--;
            }

        }
    }
}