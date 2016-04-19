package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lexi {
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tcases=Integer.parseInt(br.readLine());
		int gs=Integer.parseInt(br.readLine());
		boolean flag=false;
		char g[][]=new char[gs][gs];
		for(int i=0;i<g.length;i++){
			for(int j=0;j<g[i].length;j++){
				g[i][j]=(char)(br.read());
			}
		}
		for(int i=0;i<g.length;i++){
			for(int j=0;j<g[i].length;j++){
				System.out.print(g[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<g.length-1;i++){
			for(int j=0;j<g[i].length-1;j++){
				if(g[i][j]<=g[i][j+1] && g[i][j]<=g[i+1][j]){
					flag=true;
				}
				else
				{
					flag=false;
				}
				
			}
		}
		if(flag){
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}

}
