package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibo {

	
	public static long fibocal(int a,int b, int tt){
		tt=tt-3;
		long aa=(long)a;
		long bb=(long)b;
		long sum = 0;
		sum = bb*bb + aa;
		while(tt>0){
			
			
			aa=bb;
			bb=sum;
			tt--;
			sum = bb*bb + aa;
		}
		
		return sum;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    	String nums[] = br.readLine().split(" ");
    	int a=Integer.parseInt(nums[0]);
    	int b=Integer.parseInt(nums[1]);
    	int tot_time=Integer.parseInt(nums[2]);
    	System.out.println(fibocal(a,b,tot_time));
    	

	}

}
