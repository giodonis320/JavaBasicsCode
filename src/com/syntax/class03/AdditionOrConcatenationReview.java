package com.syntax.class03;

public class AdditionOrConcatenationReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		String  c="Hello";
		String  d="Hi";
		
		System.out.println(a+b+c+d);
		System.out.println(a+c+b+d);
		System.out.println(c+d+a+b);
		
		System.out.println(c+d +(a+b)); //here you get HelloHi30
		
		boolean boo=true;
		System.out.println(c+boo);

	}

}
