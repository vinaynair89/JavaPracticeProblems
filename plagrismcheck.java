
public class plagrismcheck {

	public static void main(String[] args) {
		
		String code1[] = {"def is_even_sum(a, b):","    return (a + b) % 2 == 0"};
		
		String code2[] = {"def is_even_sum(summand_1, summand_2):","    return (summand_1 + summand_2) % 2 == 0"};
		
		System.out.println(plagchk(code1,code2));

	}
	
	public static boolean plagchk(String code1[],String code2[]){
		
		if(code1.length!=code2.length){
			return false;
		}
		for(int i=0;i<code1.length;i++){
			if(code1[i].equals(code2[i]))
				return true;
		}
		
		return false;
	}

}
