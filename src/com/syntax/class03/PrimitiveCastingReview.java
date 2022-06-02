package com.syntax.class03;

public class PrimitiveCastingReview {

	//ctrl+space ---> auto complete 
	public static void main(String[] args) {
		
		int i=100;
		double d=100;//widening
		
		System.out.println(i);//100
		System.out.println(d);
		
		long l=10000;
		byte b=1;
		
		//byte b=130;erorr:connot convert int to byte 
		//type mismatch:cannot convert from double to int 
		int x=(int)99.99;//narrowing 
		System.out.println(x);
		
		//Type mismatch:cannot convert from int to byte
		byte c=(byte)130;
		System.out.println(c);
		
		double f=10.99;
		double dd=11.99;
		double price=100;
		
		
		
		
		
	
	}

}
