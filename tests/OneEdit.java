package tests;

import Trees.Node;

public class OneEdit {
	Node s;
	public static void main(String[] args) {
		String s="ababbabaa";
		String t="ababtbabaa";
		
		System.out.println(oneEdit(s,t));
		
		
	}
	
	public static boolean oneEdit(String s, String t){
		int m=s.length();
		int n=t.length();
		
		if(m>n){
			return oneEdit(t,s);
		}
		if(n-m>1)
			return false;
		
		int i=0,shift=n-m;
		
		while(i<m && s.charAt(i)==t.charAt(i))
			i++;
		
		if(i==m)
			return shift>0;
			
		if(shift==0)
			i++;
		
		while(i<m && s.charAt(i)==t.charAt(i+shift))
			i++;
		
		return i==m;
		
	}

}
