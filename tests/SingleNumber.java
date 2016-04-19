package tests;

public class SingleNumber {

	public static void main(String[] args) {
		int n[]={1,1,2,7,2,5,6,6,5};
		System.out.println(findsinglenum(n));

	}
	
	public static int findsinglenum(int n[]){
		//int num=0;
		
		  int firstTimeOccurence = 0;
		  int secondTimeOccurence = 0;
		  int sum=0;
		  for(int i=0;i<n.length;i++){
			  sum=sum^n[i];
			  
		  }
		 /*
		  for (int i=0; i < n.length; i++){
		   secondTimeOccurence =  secondTimeOccurence | (firstTimeOccurence & n[i]);
		   firstTimeOccurence = firstTimeOccurence ^ n[i]; 
		   int neutraliser = ~(firstTimeOccurence & secondTimeOccurence);
		   firstTimeOccurence = firstTimeOccurence & neutraliser;
		   secondTimeOccurence = secondTimeOccurence & neutraliser;
		  }*/
		  return sum;
	}

}
