package tests;

import java.util.Stack;

public class TestMax {
	 public static int solution(int X) {
	        // write your code in Java SE 8
	        
	        int no=X;
	        Stack<Integer> stack=new Stack<Integer>();
	        while(no!=0){
	            stack.push(no%10);
	            no/=10;
	        }
	        int i=1,prev=0,curr=0,p=0;
	        boolean rem=false;
	        int ele;
	        while(!stack.isEmpty()){
	            ele=stack.pop();
	            if(!stack.empty() && ele==stack.peek()){
	                int t=prev;
	                t=t*(10)+ele;
	                if(t>curr && !rem){
	                    prev=curr;
	                    curr=t;
	                    rem=true;
	                }
	                else{           
	                    curr=curr*10+ele;
	                    prev=prev*10+ele;
	                }
	            }else{
	                curr=curr*10+ele;
	                prev=prev*10+ele;
	            }
	            
	        }
	        return prev>curr?prev:curr;
	    }
	public static void main(String[] args) {
		System.out.println(solution(223336226));
	
		
	}

}
