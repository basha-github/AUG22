package com.nec.string;

public class SwapString {

	public static void main(String[] args) {
		
		
		String s1 = "Hello";
		String s2 = "JAVA";
		
		System.out.println("Before Swapping...");
		System.out.println("s2--->"+s2);
		System.out.println("s1--->"+s1);
		
		s1 = s1 + s2;// HelloJAVA---9-4..5
		s2= s1.substring(0,s1.length() - s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("After Swapping...");
		System.out.println("s2--->"+s2);
		System.out.println("s1--->"+s1);
}

}
