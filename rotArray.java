
public class rotArray {

	public static void main(String[] args) {
		int num[]={1,2,3,4,5,6,7};
		int k=3;
		rotArray(num,k);

	}
	
	public static void rotArray(int n[],int k){
		
		int n1[]=new int[n.length];
		
		for(int i=0;i<n.length;i++){
			n1[(i+k)%n.length]=n[i];
		}
		
		for(int i=0;i<n.length;i++){
			n[i]=n1[i];
		}
		
		for(int i=0;i<n.length;i++){
			System.out.print(n[i]+" ");
		}
		
	}

}
