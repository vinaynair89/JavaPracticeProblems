package tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class selectionsort {

	public static void main(String args[]) throws Exception{
		int len=7;
		int a[]=new int[len];
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<len;i++){
			a[i]=Integer.parseInt(br.readLine());
		}
		int temp=0;
		int min=0;
		for(int i=0;i<len-1;i++){
			min=i;
			for(int j=i+1;j<len;j++){
				if(a[j]<a[min])
					min=j;
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println();
		for(int i=0;i<len;i++)
			System.out.print(a[i]+" ");
		
	}

}
