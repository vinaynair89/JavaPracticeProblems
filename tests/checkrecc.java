package tests;

public class checkrecc {
	
	public static int factorial(int n, int[] dp){
		if(dp[n]!=0)
			return dp[n];
		 dp[n]=n>1?factorial(n-1,dp)*n:1;
		
		
		return dp[n];
	}

	public static void main(String[] args) {
		int n=5;
		int [] dp=new int[n];
		System.out.println(factorial(n,dp));

	}

}
