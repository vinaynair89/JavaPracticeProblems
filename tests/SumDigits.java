package tests;

import java.util.ArrayList;
import java.util.List;


public class SumDigits {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(9);
		l.add(9);
		l.add(9);
		l.add(9);
		addDig(l);
		System.out.println(l);
		
	}
	
	public static void addDig(List<Integer> l){
		for(int i=l.size()-1;i>=0;i--){
			int digit=(int) l.get(i);
			
			if(digit<9){
				l.set(i, digit+1);
				return;
			}
			else
			{
				l.set(i, 0);
			}
			
			
		}
		l.add(0);
		l.set(0, 1);
		
	}

}
