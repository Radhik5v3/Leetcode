class Solution {
    public int subtractProductAndSum(int n) {
        int product=1;
        int sum=0;
        int temp = n;
		while(temp>0){
		    int digit=temp%10;
		    product=product*digit; 
		    temp=temp/10;
		}
        while(n>0){
		    int digi=n%10;
		    sum=sum+digi; 
		    n=n/10;
		}
         
        return product-sum;
		   
    }
}