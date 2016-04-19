package tests;

public class ZigZagStr {

	public static void main(String[] args) {
		String str="ABCDEFG";
		int n=3;
		zigzag(str,n);

	}
	
	
	
	public static void zigzag(String str,int n){
		
		StringBuilder st[]=new StringBuilder[n];
		for(int i=0;i<n;i++){
			st[i]=new StringBuilder();
		}
		
		int row=0;
		boolean down=true;
		
		for(int i=0;i<str.length();i++){
			st[row].append(str.charAt(i));
			
			
			
			if(row==n-1){
				down=false;
			}
			else if(row==0){
				down=true;
			}
			
			if(down){
				row++;
			}
			else{
				row--;
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.print(st[i]);
		}
	}

}
