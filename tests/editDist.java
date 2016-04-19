package tests;

public class editDist {

	public static void main(String[] args) {
		String s1="geek";
		String s2="geeks";
		System.out.println(editdist(s1,s2));

	}
	
	public static boolean editdist(String s1,String s2){
		int m=s1.length();
		int n=s2.length();
		
		if((m-n)>=2||(n-m)>=2){
			return false;
		}
		
		int edits=0;
		int i=0,j=0;
		
		while(i<m && j<n){
			if(s1.charAt(j)!=s2.charAt(i)){
				if(edits==1){
					return false;
				}
				if(m>n){
					i++;
				}
				else if(m<n){
					j++;
					
				}
				else
				{
					i++;
					j++;
				}
				edits++;
			}
			else
			{
				i++;
				j++;
			}
		}
		if(i<m || j<n){
			edits++;
		}
		
		return edits==1;
		
		
	}

}
