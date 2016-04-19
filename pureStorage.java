import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class pureStorage {
	static int countPalindrome(String str)
	{
		int i,j,k,count=0;
		for(i=1;i<str.length()-1;i++)
		{
			k=i-1;j=i+1;  //count odd length palindromes
			while(k>=0 && j<str.length() && str.charAt(k) == str.charAt(j) )
			{
				++count;
				k--;j++;
			}

			k=i;j=i+1; //count even length palindrome
			while(k>=0 && j<str.length() && str.charAt(k) ==str.charAt(j) )
			{
				++count;
				k--;j++;
			}
		}
		return count+str.length();
	}
	public static void main(String[] args) throws IOException{
	    System.out.println(countPalindrome("hellolle"));
	}
	
}
