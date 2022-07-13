package lab;

public class MaxMinArrayEg {

	public static void main(String[] args) {
		
		//initialize array
		int [] arr = new int [] {1,7,4,8,2,3,9};
		int min = arr[0];
		int max = arr[0];
		
		System.out.println("Original Array");
		//loop for printing array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " " );	
		}
		System.out.println();
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) // compare array element with max
				max=arr[i];
		}
		System.out.println("Largest : " + max);
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) // compare array element with min
				min=arr[i];
		}
		System.out.println("Smallest : " + min);
	}
}
