package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int nums[]={5,2,7,4,8,1};
		nums=Selection(nums);
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+" ");
		}

	}
	
	public static int[] Selection(int n[]){
		int len=n.length;
		int lmin=0;
		
		for(int i=0;i<len-1;i++){
			lmin=i;
			for(int j=i+1;j<len;j++){
				if(n[j]<n[lmin]){
					lmin=j;
				}
			}
			int temp=n[i];
			n[i]=n[lmin];
			n[lmin]=temp;
		}
		
		
		return n;
	}

}
