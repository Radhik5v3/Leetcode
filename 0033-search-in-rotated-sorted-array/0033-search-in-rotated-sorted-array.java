class Solution {
    public int search(int[] nums, int target) {

        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {

            int mid = i + (j - i) / 2;

            // 1. Target found
            if (nums[mid] == target) {
                return mid;
            }

            // 2. Left half is sorted
            if (nums[i] <= nums[mid]) {

                // Target is in left sorted half
                if (nums[i] <= target && target < nums[mid]) {
                    j = mid - 1;
                }
                // Target is in right half
                else {
                    i = mid + 1;
                }
            }

            // 3. Right half is sorted
            else {

                // Target is in right sorted half
                if (nums[mid] < target && target <= nums[j]) {
                    i = mid + 1;
                }
                // Target is in left half
                else {
                    j = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }
}