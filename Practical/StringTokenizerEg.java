package com;

import java.util.StringTokenizer;

public class StringTokenizerEg {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("welcome to Anudip Foundation", " ");
	//	StringTokenizer st = new StringTokenizer("welcome,to,Anudip,Foundation");
				
		while(st.hasMoreTokens()) {
			  System.out.println(st.nextToken()); 
			//System.out.println(st.nextToken(",")); 
		}

	}

}
