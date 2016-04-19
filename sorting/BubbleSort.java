package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int nums[]={5,2,7,4,8,1};
		nums=Bubble(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}
		

	}
	
	public static int[] Bubble(int n[]){
		int len=n.length;
		
		for(int i=0;i<len-1;i++){
			for(int j=0;j<len-1-i;j++){
				if(n[j]>n[j+1]){
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
		
		return n;
	}

}
