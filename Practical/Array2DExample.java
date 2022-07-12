package com;

public class Array2DExample {

	public static void main(String[] args) {
		
		//declaration and initialization
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}}; //3*3 matrix
		
		//printing 2d array
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		//declaration and initialization
		int ar[][] = {{1,2},{4,5},{7,8}}; //3*2 matrix
		
		//printing 2d array
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(ar[i][j]);
			}
			System.out.println();
		}
		

	}

}
