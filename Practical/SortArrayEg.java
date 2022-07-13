package lab;

public class SortArrayEg {

	public static void main(String[] args) {
		
		//initialize array
		int [] arr = new int [] {1,7,4,9,3,8,2,3,9};
		int temp=0;
		
		System.out.println("Original Array");
		//loop for printing array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
		
		//sort array in ascending
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		System.out.println();
		System.out.println("Array in Ascending order");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
		
		//sort array in descending
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}	
			}
		}
		System.out.println();
		System.out.println("Array in Descending order");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");	
		}				
	}
}
