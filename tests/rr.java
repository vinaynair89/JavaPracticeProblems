package tests;

public class rr {

	public static void main(String[] args) {
		int arr[]={0,1,4};
		int run[]={5,2,3};
		int q=3;
		
		System.out.println(check(arr,run,q));

	}
	
	public static double check(int arr[],int rem[], int q){
		int size=3;
		int flag=0;
		int wai[]=new int[size];
		double sum=0;
		do{
			flag=0;
		for(int i=0;i<size;i++)
        {		//arr[i]=arr[i]-rem[i];
                    if(rem[i]>q)
                    {
                                System.out.print("P"+(i+1)+"\t");
                                for(int j=0;j<size;j++)
                                {
                                            if(j==i)
                                                        rem[i]=arr[i]-rem[i]-q;
                                            else if(rem[j]>0)
                                                        wai[j]+=q;
                                }
                    }
                    else if(rem[i]>0)
                    {
                                System.out.print("P"+(i+1)+"\t");
                                for(int j=0;j<size;j++)
                                {
                                            if(j==i)
                                                        rem[i]=0;
                                            else if(rem[j]>0)
                                                        wai[j]+=arr[i]-rem[i];
                                }
                    }
        }
		for(int i=0;i<size;i++)
            if(rem[i]>0)
                        flag=1;
		}while(flag==1);
		for(int i=0;i<size;i++){
			sum+=wai[i];
		}
		return sum/3;
	}

}
