package tests;

public class PlaindromeDigits {

	public static void main(String[] args) {
		int x=1232321;
		int div=1;
		
		while(x/div>=10){
			div=div*10;
		}
		
		while(x!=0){
			int l=x/div;
			int r=x%10;
			
			if(l!=r){
				System.out.println("Not Palindrome");
			}
			
			x=(x%div)/10;
			div/=100;
		}
		
		System.out.println("Palindrome");
		

	}

}
