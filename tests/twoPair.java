package tests;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;

public class twoPair {
	public static void main(String args[]) throws Exception{
		int a[] = {1,2,3,4,5};
		int b[] = {0,3,5,6,7,8,9,67,21};
		int c[] = new int[a.length+b.length];
		
		int i=0,j=0,k=0;
		
		
		while(i<a.length && j<b.length){
			
			if(a[i]<b[j]){
				c[k++]=a[i++];
			}
			else
			{
				c[k++]=b[j++];
			}
		}
		
		while(i<a.length){
			c[k++]=a[i++];
		}
		
		while(j<b.length){
			c[k++]=b[j++];
		}
		for(int s=0;s<c.length;s++){
			System.out.print(c[s]+" ");
		}
		//System.out.println(count+1);
		
	}

	
}
/*for(int i=0;i<a.length;i++)
c[j++]=a[i];
for(int i=0;i<b.length;i++)
c[j++]=b[i];

for(int i=0;i<c.length;i++){
for(int k=i+1;k<c.length;k++){
	if(c[i]>c[k]){
		int temp=c[i];
		c[i]=c[k];
		c[k]=temp;
	}
}
}

for(int i=0;i<c.length;i++){
System.out.print(c[i]+" ");
}

*/
