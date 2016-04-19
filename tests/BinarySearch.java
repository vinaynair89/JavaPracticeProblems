package tests;

public class BinarySearch {

	public static boolean binarysearch(int t, int num[]){
		
		int ceil=num.length-1;
		int fl=0;
		
		
		
		while(fl<ceil){
			
			int mid=(ceil+fl)/2;
			
			if(num[mid]==t){
				return true;
			}
			if(num[mid]>t){
				ceil=mid;
			}
			else{
				fl=mid;
			}
		}
			
		return false;
		
	}
	
	public static void main(String[] args) {
		int num[]={1,2,3,4,5,6,7,8};
		int t=9;
		System.out.println("Hello");
		System.out.println(binarysearch(t,num));

	}

}
