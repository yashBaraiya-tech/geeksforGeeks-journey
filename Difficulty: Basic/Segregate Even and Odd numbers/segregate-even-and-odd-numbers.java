class Solution {
    void segregateEvenOdd(int arr[]) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int x : arr) {
            if (x % 2 == 0)
                even.add(x);
            else
                odd.add(x);
        }

        Collections.sort(even);
        Collections.sort(odd);

        int k = 0;

        for (int x : even)
            arr[k++] = x;

        for (int x : odd)
            arr[k++] = x;
    }
}