class Solution {
    static int closestNumber(int n, int m) {
        boolean flag = true;
        int i = 0;
        int ans = n;

        while (flag) {
            int num1 = n + i;
            int num2 = n - i;

            if (num1 % m == 0 && num2 % m == 0) {
                if (Math.abs(num1) >= Math.abs(num2))
                    ans = num1;
                else
                    ans = num2;

                flag = false;

            } else if (num1 % m == 0) {
                ans = num1;
                flag = false;

            } else if (num2 % m == 0) {
                ans = num2;
                flag = false;
            }

            i++;
        }

        return ans;
    }
}