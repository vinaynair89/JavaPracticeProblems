package tests;

public class reverseNumber {

	public static void main(String[] args) {
		int num=1000000003;
		
		System.out.println(reverse(num));

	}
	
	public static int reverse(int num){
		
		int ret=0;
		
		while(num!=0){
			if(Math.abs(ret)>214748364)
				return 0;
			ret = ret*10+num%10;
			num=num/10;
			//ret=ret*10;
		}
		
		return ret;
		
	}

}
