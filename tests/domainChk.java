package tests;

import java.util.HashMap;

public class domainChk {

	public static void main(String[] args) {
		String domains[]={"en.wiki.org", "codefights.com", "happy.net", "code.info"};
		HashMap<String, String> map=new HashMap<>();
	    map.put("org","organization");
	    map.put("net","network");
	    map.put("info","information");
	    map.put("com","commercial");
	        
	    String res[]=new String[domains.length];
	    for(int i=0;i<domains.length;i++){
	        String[] vals=domains[i].split("\\.");
	        if(vals.length>0)
	            res[i]=map.get(vals[vals.length-1]);
	    }
	   
	    for(int i=0;i<res.length;i++){
	       System.out.println(res[i]);
	    }

	}

}
