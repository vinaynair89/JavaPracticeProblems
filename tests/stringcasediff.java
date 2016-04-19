package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringcasediff {
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countstr=Integer.parseInt(br.readLine());
        String s[] = new String[countstr];
        for(int i=0;i<countstr;i++){
            s[i]=br.readLine();
        }
        for(int i=0;i<s.length;i++){
        	 String reverse="";
        	 boolean isFunny=true;
        	 for(int j = s[i].length() - 1 ; j >= 0 ; j-- )
                 reverse = reverse + s[i].charAt(j);
        	
        	 for(int k=s[i].length()-2;k>0;k--){
        		// System.out.println((s[i].charAt(k)+"-"+s[i].charAt(k+1))+(s[i].charAt(k)-s[i].charAt(k+1)));
        		// System.out.println((reverse.charAt(k)+"-"+reverse.charAt(k+1))+(reverse.charAt(k)-reverse.charAt(k+1)));
        		 if(Math.abs((s[i].charAt(k)-s[i].charAt(k+1)))!=Math.abs((reverse.charAt(k)-reverse.charAt(k+1)))){
        			 isFunny=false;
        			 break;
        			 
        		 }
        	 }
        	 if(isFunny)
        		 System.out.println("Funny");
        	 else
        		 System.out.println("Not Funny");
        }
	}

}
