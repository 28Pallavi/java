package com;

public class ExceptionExample {
	
	public void calculatePerUnit() {
		int qty =0 , rate = 10000 , punit = 0;
		try {
			punit = rate/qty;  //may exception arise
		}
		catch(Exception e) {
		//	System.out.println("Product quantity cannot be zero...");
			System.out.println(e);
			
		}
		System.out.println("Per unit price be : " + punit);
		
	}

	public static void main(String[] args) {
		
		ExceptionExample obj = new ExceptionExample();
		obj.calculatePerUnit();

	}

}
