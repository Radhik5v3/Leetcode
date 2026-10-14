class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int digisum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while(nums[i]>0){
                int digit =nums[i]%10;
               digisum=digisum+digit;
                nums[i]=nums[i]/10;
            }
        }
        int total= sum-digisum;
        return total;
    }
}