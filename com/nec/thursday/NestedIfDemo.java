package com.nec.thursday;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		char ch='Y';
		int sum=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("enter number");
			int num = sc.nextInt();
			sum = sum + num;
			System.out.println("Do u want to repeat press 'Y' or 'N'");
			String str = sc.next();
			ch = str.charAt(0);
			
		}while(ch == 'Y' || ch == 'y');

		System.out.println("total sum--->"+sum);
	}

}
