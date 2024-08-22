package com.nec.thursday;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		
		// 100.... 200
		// 107.117 127 137........200
		
		for(int i=100;i<=200;i++) {
			// 107
			int n=i,r;
			while(n!=0) {// 0 !=0
				r = n % 10;// 0 % 10---1
				if(r == 7) {
					System.out.println(i);
					n=0;
				}
				n = n /10;// 0 /10---0
			}// while
		}// for
	}

}
