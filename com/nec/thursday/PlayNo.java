package com.nec.thursday;

public class PlayNo {

	public static void main(String[] args) {
	
		
		int num =12345,w,rev=0;
		// 54321
		while(num !=0) {
			w = num % 10;// 4
			rev = rev * 10+w;// 5*10+4..54
			num = num/10;
				
		}
		System.out.println("result---->"+rev);
		
	}

}
