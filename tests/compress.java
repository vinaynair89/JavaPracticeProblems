package tests;

public class compress {
	public static void main(String args[]){
		String str = "aaaabbbbbbcccccccpqrstuv";
		System.out.println(compress(str));
	}
   static String compress(String str) {
        int curr=1;
        StringBuilder s = new StringBuilder();
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                curr++;
            }
            else
            {
            s.append(str.charAt(i-1)).append(curr>1?curr:"");
            curr=1;
            }
            
        }
        s.append(str.charAt(str.length()-1)).append(curr>1?curr:"");
        return s.toString();
    }
}
