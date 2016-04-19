package tests;

public class PairNumsTarget {

	public static void main(String[] args) {
		int nums[]={4,6,8,9,3};
		
		boolean loc[]=new boolean[1000];
		int target=12;
		int curr=0;
		for(int i=0;i<nums.length;i++){
			curr=target-nums[i];
			
			if(curr>0 && loc[curr]){
				System.out.println(nums[i]+" "+(curr));
			}
			
			loc[nums[i]]=true;
		}

	}

}
