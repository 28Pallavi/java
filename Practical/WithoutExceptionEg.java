package com;

public class WithoutExceptionEg {
	
	public void calculatePerUnit() {
		
		int qty = 0 , rate = 10000 , punit = 0;
		punit = rate/qty; 
		System.out.println("Per unit price be : " + punit);
	}

	public static void main(String[] args) {
			
			ExceptionExample obj = new ExceptionExample();
			obj.calculatePerUnit();
	}

}
