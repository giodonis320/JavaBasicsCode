package com.syntax.class03;

public class PrimitiveCasting {
	public static void main(String[] args) {
		
	int i=100;
	double d= 100;
	
	System.out.println(i); //100
	System.out.println(d); //100.0
	
	///process of casting in java converting one type into another 
	//Widening convert smaller data type to bigger/ implicit/automatic
	//data type that rep numbers--- byte -> short -> int -> long -> float -> double
	//narrowing/explicit/manually 
	//double -> float -> long -> int -> char -> short -> byte
	//Casting converting one type another 
	
	// can take any numeric value and store it is a double, all about casting
	long l=10000;
	
	//byte b=130; error; cannot convert from int to byte 
	//int x=99.99 cannot convert from double ot int 
	
	int x=(int)99.99; //narrowing 
	System.out.println(x);
	
	byte b=(byte)130;
	System.out.println(b);
	
	//type mismatch: cannot convert from double to float 
	float f=10.99f;
	double dd=9.99;
	double price=100;
	
	
	
		
	}

}
