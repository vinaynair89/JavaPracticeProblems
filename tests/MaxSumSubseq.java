package tests;

public class MaxSumSubseq {

	public static void main(String[] args) {
		int nums[]={-1,3,-2,4,-4,6};
		System.out.println("Max Sum: "+maxSub(nums));

	}
	
	public static int maxSub(int nums[]){
		int maxSum=0;
		int sum=0;
		
		for(int i=0;i<nums.length;i++){
			sum+=nums[i];
			if(maxSum<sum){
				maxSum=sum;
				//System.out.println(nums[i]+" ");
			}
			if(sum<0)
				sum=0;
		}
		return maxSum;
	}
	
}
	
				
				
				
				
				
				
				
				
				
				
				
				
				
	
