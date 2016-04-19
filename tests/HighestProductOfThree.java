package tests;

public class HighestProductOfThree {

	public static void main(String[] args) {
		int num[]={4,-5,-6,-2,1};
		
		if(num.length<3){
			System.out.println("Less than 3");
		}
		
		int high = Math.max(num[0], num[1]);//4
		int low = Math.min(num[0], num[1]);//-5
		
		int highesttwo=num[0]*num[1];//-20
		int lowesttwo=num[0]*num[1];//-20
		
		int highestthree=num[0]*num[1]*num[2];//-120
		
		
		for(int i=2;i<num.length;i++){
			int curr=num[i];
			
			highestthree=Math.max(Math.max(highestthree, curr*highesttwo), curr*lowesttwo);
			
			highesttwo=Math.max(Math.max(highesttwo, curr*high), curr*low);
			lowesttwo=Math.min(Math.min(lowesttwo, curr*high), curr*low);
		}
		
		System.out.println("Highest="+highestthree);

	}

}
