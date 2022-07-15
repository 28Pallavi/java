package lab;

public class ProductMatrixEx {

	public static void main(String[] args) {
		
		//creating two matrices
		int arr[][] = {{9,8,7},{6,5,4},{3,2,1}};
		int arr1[][] = {{6,4,3},{1,2,3},{2,1,0}};
		
		int r=arr.length;
		int c=arr[0].length; //Calculate the no of rows and columns in arr
		
		int r1=arr1.length;
		int c1=arr1[0].length;  // Calculate the no of rows and columns in arr1
		
		if(c!=r1)
		{
			System.out.println("Multiplication not possible");
			
		}
		else
		{
			int res[][] = new int[r][c1];  //hold result
			
			//product of matrices arr and arr1. store in res
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c1;j++)
				{
					for(int k=0;k<r1;k++)
					{
						res[i][j]=res[i][j]+arr[i][k]*arr1[k][j];
					}
				}
			}
			System.out.println("Product of two matrices");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print(res[i][j] + " ");
				}
				System.out.println();
			}
		
	    }
    }
}


