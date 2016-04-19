package tests;

public class LongestPalinSubstr {

	public static void main(String[] args) {
		String s="abbacdddeeeedddaba";
		
		System.out.println(longPalin(s));
	}
	
	public static String longPalin(String s){
		
		int start=0,end=0;
		
		for(int i=0;i<s.length();i++){
			int len1 = expandCenter(s,i,i);
			int len2 = expandCenter(s,i,i+1);
			int len = Math.max(len1,len2);
			if(len>(end-start)){
				start=i-(len-1)/2;
				end=i+len/2;
				System.out.println(start+" "+end);
				
			}
		}
		
		return s.substring(start,end+1);
		
	}
	
	public static int expandCenter(String s, int left, int right){
		int l=left,r=right;
		
		while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
			l--;
			r++;
		}
		
		return r-l-1;
	}

}
