package tests;

public class LongSubstDistinct {

	public static void main(String[] args) {
		String s="abbbbaaccccdddd";
		int i=0,j=-1,maxLen=0;
		for(int k=1;k<s.length();k++){
			if(s.charAt(k)==s.charAt(k-1)){
				continue;
			}
			if(j>=0 && s.charAt(j)!=s.charAt(k)){
				maxLen=Math.max(k-i, maxLen);
				i=j+1;
				System.out.println("i val: "+i);
			}
			j=k-1;
		}
		
		System.out.println(Math.max(s.length()-i,maxLen));

	}

}
