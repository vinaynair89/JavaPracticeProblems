package tests;

public class ProductOfNum {

	public static void main(String[] args) {
		int num[]={1,2,3,4};
		int prodEI[]=new int[num.length];
		
		int product=1;
		for(int i=0;i<num.length;i++){
			prodEI[i]=product;
			product=product*num[i];
		}
		
		for(int i=0;i<num.length;i++){
			System.out.println(prodEI[i]);
		}
		
		System.out.println();
		
		product=1;
		for(int i=num.length-1;i>=0;i--){
			prodEI[i]*=product;
			product=product*num[i];
		}
		
		for(int i=0;i<num.length;i++){
			System.out.println(prodEI[i]);
		}

	}

}
