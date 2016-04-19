package tests;

public class LongestSubstring {

	public static void main(String[] args) {
		String s="baatbcsssuiuiui";
		boolean check[]=new boolean[256];
		int i=0,j=0,len=0;
		for(j=0;j<s.length();j++){
			while(check[s.charAt(j)]){
				check[s.charAt(i)]=false;
				i++;
				
			}
					
			check[s.charAt(j)]=true;
			len=Math.max(len, j-i+1);
		}
		
		
		

	}

}
