class Solution {
     static int searchIdx(int[] nums) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int pivot = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] <= nums[n - 1]) {
                e = mid - 1;
            } else {
                pivot = mid;
                s = mid + 1;
            }
        }

        return pivot;
    }

    static int binarySearch(int[] nums, int target, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return -1;
    }
    
    int search(int[] nums, int target) {
        // code here
        int n = nums.length;
        int ans = -1;

        int pivot = searchIdx(nums);

        if (pivot == -1) {
            ans = binarySearch(nums, target, 0, n - 1);
        } else if (target >= nums[0] && target <= nums[pivot]) {
            ans = binarySearch(nums, target, 0, pivot);
        } else {
            ans = binarySearch(nums, target, pivot + 1, n - 1);
        }

        return ans;
    }
}