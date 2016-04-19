import java.util.ArrayList;


public class t1 {
	static String[] taskMaker(String[] source, int challengeId) {
	    
	    ArrayList<String> list=new ArrayList<>();
	    for(String s:source){
	        s=s.trim();
	        found(s, challengeId,list);
	             
	    }
	    String[] res=new String[list.size()];
	    int i=0;
	    for(String s:list){
	        res[i++]=s;
	        System.out.println(s);
	    }
	        
	    return res;
	}

	static public void found(String s, int no, ArrayList<String> list){
	    int i= s.indexOf('/',4);
	    //System.out.println(s.substring(0,4));
	    
	    if(s.length()>7 && s.substring(0,4).equals("//DB") && no!=0){
	    	//System.out.println(s.substring(5, i));
	    	if(no==Integer.parseInt(s.substring(5, i)))
	    		list.add(s.substring(i+2));
	    }
	    else
	    	list.add(s);
	}

	public static void main(String args[]){
		String source[] = {"ans = 0",
				"for i in range(n):",
				"    for j in range(n):",
				"    //DB 3//for j in range(1, n):",
				"    //DB 2//for j in range(n + 1):",
				"        ans += 1",
				"return ans"
		};
				
		taskMaker(source,3);
	}
}
