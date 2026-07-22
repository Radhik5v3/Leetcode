class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int i=arr[0];
        int j=n;
        int k=0;
        while(i<n){
            arr[k]=nums[i];
            k++;
            arr[k]=nums[j];
            k++;
           
            i++;
            j++;
         
        }
        return arr;
    }
}