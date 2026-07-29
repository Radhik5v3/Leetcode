class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int current=0;
         int maximum=0;
         for(int i=0;i<nums.length;i++){
            if (nums[i]==1){
                   current++;
                  if(current>maximum){
                    maximum=current;
                }

            }
            else if(nums[i]==0){
                current=0;
            }
         }
         return maximum;
    }
}