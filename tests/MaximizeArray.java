package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class MaximizeArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int num1[]=new int[n];
		int num2[]=new int[n];
		
		for(int i=0;i<num1.length;i++){
			num1[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<num2.length;i++){
			num2[i]=Integer.parseInt(br.readLine());
		}
		
		int numbers[]=maxArr(num1,num2);
		
		for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}

	}
	
	public static int[] maxArr(int num1[],int num2[]){
		
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		//int max=0;
		for(int i=0;i<num1.length;i++){
			if(!hm.containsKey(num1[i])){
				hm.put(num1[i], num1[i]);
			}
		}
		
		for(int i=0;i<num2.length;i++){
			if(!hm.containsKey(num2[i])){
				hm.put(num2[i], num2[i]);
			}
			
		}
		
		int maximum[]=new int[num1.length];
		
		for(int i=0;i<maximum.length;i++){
			maximum[i]=Collections.max(hm.keySet());
			hm.remove(maximum[i]);
		}
		
		return maximum;
		
		
	}

}
