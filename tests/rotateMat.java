package tests;

public class rotateMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m[][]={{1,2,3},{5,6,7},{9,10,11}};
		int n=3;
		int i, j;
		
		
		 for (i = 0; i < n; i++)
		    {
		        for (j = 0; j < n; j++)
		        {
		            System.out.print(m[i][j]+" ");
		        }
		        System.out.println();
		    }
		 
		 
	    // first mirror the matrix along the diagnal line.
	    for (i = 0; i < n; i++)
	    {
	        for (j = i + 1; j < n; j++)
	        {
	            int tmp = m[i][j];
	            m[i][j] = m[j][i];
	            m[j][i] = tmp;
	        }
	    }
	    
	    System.out.println();
	    
	    for (i = 0; i < n; i++)
	    {
	        for (j = 0; j < n; j++)
	        {
	            System.out.print(m[i][j]+" ");
	        }
	        System.out.println();
	    }
	    
	    System.out.println();
	    
	    for (i = 0; i < n / 2; i++)
	    {
	        for (j = 0; j < n; j++)
	        {
	            int tmp = m[j][i];
	            m[j][i] = m[j][n - i - 1];
	            m[j][n - i - 1] = tmp;
	        }
	    }
	    
	    System.out.println();
	    
	    for (i = 0; i < n; i++)
	    {
	        for (j = 0; j < n; j++)
	        {
	            System.out.print(m[i][j]+" ");
	        }
	        System.out.println();
	    }
	    

	}

}
