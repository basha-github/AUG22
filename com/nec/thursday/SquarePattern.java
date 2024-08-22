package com.nec.thursday;

public class SquarePattern {
	
	/*
	 * 
	 * * * * *
	 *       *
	 *       *
	 *       *
	 *       *
	 * * * * * 
	 */
	public static void main(String[] abc) {
		for(int r=1;r<=6;r++) {
			if( (r==1) || (r==6)) {
				System.out.print("* * * * *");
			}
			else {
				for(int c=1;c<=5;c++) {
					if( (c==1) || (c==5)) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				
			     }//for c
			}// else
			System.out.println();
		}
		
		
	}

}
