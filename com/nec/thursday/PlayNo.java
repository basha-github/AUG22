package com.nec.thursday;

public class PlayNo {
	public static void main(String[] args) {
		int num =30005,p=1,r,res=0;
		// 3+9---12
		//12245
		while(num !=0) {
			r = num % 10;// 
			if(r == 3) {
				r=r+9;
			}
			res = res + r*p;// 0+5*1---5+4*10---45...7*100+45---745
			num = num/10;// 123
			p=p*10;// 100
		}
		System.out.println("result---->"+res);
	}
}
