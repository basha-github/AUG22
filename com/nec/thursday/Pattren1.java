package com.nec.thursday;

public class Pattren1 {

	public static void main(String[] args) {
		/*
		 * 
		 * 1
		 * 0 1
		 * 0 1 0
		 * 1 0 1 0
		 * 1 0 1 0 1
		 */
		
		for(int r=1,v=1;r<=5;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(v++ % 2+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
