package tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputmat {
	
	public static void main(String args[]) throws Exception{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	int f[][] = new int[n][];
    	
    	for(int i=0;i<n;i++){
    		String num[] = br.readLine().split(" ");
    		//int nmbr[]=new int[num.length];
    		int j=0;
    		for(String s: num){
    			f[i][j++] = Integer.parseInt(s);
    		}	
    	}
    	
    
	}

}
