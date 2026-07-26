class Solution {
    public int[] plusOne(int[] digits) {
        int sum[]=new int [digits.length+1];
        sum[0]=1;
    for(int i=digits.length-1;i>=0;i--){
        if(digits[i]==9){
            digits[i]=0;
             
        }
        else if(digits[i]!=9){
            digits[i]=digits[i]+1; 
              return digits;
        }
     
    }
    return sum;
    
    }
}