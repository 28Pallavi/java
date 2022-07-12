package com;

public class ArrayExample {

	public static void main(String[] args) {
		
		int arr[] = new int[10];  //declaration and instantiation
		
		//initialization
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
	    arr[5] = 600;
	    arr[6] = 700;
	    arr[7] = 800;
	    arr[8] = 900;
	    arr[9] = 1000;
	    //arr[10] = 110; //inserting element outside the bound
	
	    //traversing an array
	    for(int i=0;i<arr.length;i++) {  //length is property of array
	    	System.out.println("Array value are : " + arr[i] + " ");
	    }
    	System.out.println();
    	System.out.println("value at 6th position : " + arr[6] + " "); //specify element on index
    	System.out.println("Length of array" + arr.length);


	}

}
