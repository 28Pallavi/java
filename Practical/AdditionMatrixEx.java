package lab;

public class AdditionMatrixEx {

	public static void main(String[] args) {
		
		//creating two matrices
		int arr[][] = {{9,8,7},{6,5,4},{3,2,1}};
		int arr1[][] = {{9,8,7},{6,5,4},{3,2,1}};
		
		int result[][]=new int [3][3]; //matrix to store sum of arr and arr1
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				result[i][j]=arr[i][j]+arr1[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}		
	}
}
