class Solution {
    public ArrayList<Integer> arranged(int[] arr) {
        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int e : arr) {
            if (e > 0)
                positive.add(e);
            else
                negative.add(e);
        }

        int i = 0;

        while (i < positive.size() && i < negative.size()) {
            ans.add(positive.get(i));
            ans.add(negative.get(i));
            i++;
        }

        while (i < positive.size()) {
            ans.add(positive.get(i));
            i++;
        }

        while (i < negative.size()) {
            ans.add(negative.get(i));
            i++;
        }

        return ans;
    }
}