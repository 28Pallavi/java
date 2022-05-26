package com;
import java.util.*;
public class SumOfEvenNumber {

	public static void main(String[] args) {
		int n,sum=0;
		System.out.println("Enter a number:");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(i % 2 == 0) {
				sum += i;
			}	
		}
		System.out.println("sum of even numbers are :" +sum);
	}

}
