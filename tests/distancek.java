package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class distancek {

		public static void main(String args[] ) throws Exception {
		    Scanner s =new Scanner(System.in);
			    int n=Integer.parseInt(s.nextLine());
			    int [][]mat=new int [n][];   
			    boolean chk=false;
			    for(int i=0;i<n;i++){
			        String[]nos=s.nextLine().split(" ");
			        mat[i]=new int[nos.length];
		        }
		    int k = Integer.parseInt(s.nextLine());
		    System.out.println(findDuplicateWithinIndex(mat,k));
		} 
		    public static String findDuplicateWithinIndex(int [][] input, int k){
		        HashSet<Integer> hs = new HashSet<Integer>();
		        int currentK = 0;
		        for(int i=0 ; i<input.length-1;i++){
		            for(int j=0; j<input[i].length-1;j++){
		                Integer cell = input[i][j];
		               // System.out.println(cell);
		                if(!hs.add(cell)){
		                    if(currentK<k)
		                        return "YES";
		                    }
		                    if(currentK<k)
		                        currentK++;
		                    else
		                        currentK = 0;
		            }
		        }
		        return "NO";
		    }

		
}
