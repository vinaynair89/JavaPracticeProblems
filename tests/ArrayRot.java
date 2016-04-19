package tests;

public class ArrayRot {
	
	
	public static void main(String[] args) {
		int n[]={1,2,3,4,5,6,7,8,9};
		int rot=3;
		printArray(n);
		//arrayRotate(n,rot);
		//rotateArray(n, rot);
		printArray(n);
		System.out.println(search(n,18));
	}
	
	
	public static void printArray(int n[]){
		for(int i=0;i<n.length;i++){
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	
	public static void arrayRotate(int n[],int rot){
		
		int index=0;
		
		for(int i=0;i<n.length;i++){
			
			int capture = (rot+index)%n.length;
			
			int val = n[capture];
			
			n[capture]=n[0];
			n[0]=val;
			index=capture;
			printArray(n);
			
		}
		
	}
	
	public static boolean search(int n[],int tar){
		
		int low=0;
		int high=n.length-1;
		
		while(low<high){
			int mid=(low+high)/2;
			if(n[mid]<tar){
				low=mid;
			}
			else if(n[mid]>tar){
				high=mid;
			}
			else if(n[mid]==tar){
				return true;
			}
			
		}
		
		return false;
		
	}
	

}
