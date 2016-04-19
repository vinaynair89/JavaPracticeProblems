package tests;

import java.util.ArrayList;

public class arrayAddition {

	public static void main(String[] args) {
		int n1[]={3,4,5,6,7,8};
		int n2[]={2,3,4,5,6,7,8,9,4,5};
		
		arrayAdd(n1,n2);

	}
	
	public static void arrayAdd(int n1[], int n2[]){
		
		int len=0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		StringBuilder st=new StringBuilder();
		
		if(n1.length<n2.length)
			len=n1.length;
		else
			len=n2.length;
		int sum=0;
		int i;
		for(i=0;i<len;i++){
			sum=sum+n1[i]+n2[i];
			if(sum>9){
				int part1=sum%10;
				int part2=sum/10;
				
				//st.append(part2);
				//st.append(part1);
				a.add(part2);
				a.add(part1);
			}
			else
			{
				a.add(sum);
				//st.append(sum);
			}
			sum=0;
		}
		//int chklen=0;
		if(n1.length<n2.length)
			for(int j=i;j<n2.length;j++){
				a.add(n2[j]);
				//st.append(n2[j]);
			}
		else
			for(int j=i;j<n1.length;j++){
				a.add(n1[j]);
				//st.append(n1[j]);
			}
		
		//System.out.println(st.toString());
		
		//int array[]=new int[a.size()];
		//return a.toString();
		for(int k=0;k<a.size();k++){
			System.out.print(a.get(k)+" ");
		}
		
		
	
		//System.out.println();
		
	}

}
