class Solution {
    public int[] numberGame(int[] nums) {
        // Sort the array in ascending order
        Arrays.sort(nums);
        
        // Iterate through the array with a step of 2 and swap adjacent elements
        for (int i = 0; i < nums.length; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        
        return nums;
    }
}