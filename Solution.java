
public class Solution {

	public static void main(String[] args) {
		
		int n[]={-3,-1,2,1,5,7};
		System.out.println(BinSrch(n));

	}
	
	public static int BinSrch(int n[]){
		
		int ceil=n.length-1;
		int fl=0;
		
		
		
		while(fl<ceil){
			
			int mid=(ceil+fl)/2;
			
			if(n[mid]==mid){
				return mid;
			}
			if(n[mid]>mid){
				ceil=mid;
			}
			else{
				fl=mid;
			}
		}
		
		return 0;
		
	}

}
