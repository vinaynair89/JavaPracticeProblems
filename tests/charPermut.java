package tests;

public class charPermut {
	public static void main(String args[]){
		String str="taco cat ao";
		
		System.out.println(chkPermut(str));
	}
	
	public static boolean chkPermut(String str){
		
		int count=0;
		
		int table[]= new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		
		for(char c: str.toCharArray()){
			int x= getCharNum(c);
			if(x!=-1){
				table[x]++;
				if(table[x]%2==1){
					count++;
				}
				else{
					count--;
				}
			}
		}
		
		return count<=1;
	}
	
	public static int getCharNum(char c){
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int A = Character.getNumericValue('A');
		int Z = Character.getNumericValue('Z');
		int val = Character.getNumericValue(c);
		if(a<=val && val<=z){
			return val - a;
		}
		else if(A<=val && val>=Z){
			return val - A;
		}
		
		return -1;
			
	}
	

}
