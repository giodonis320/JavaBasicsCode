package com.syntax.class03;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		// OPERATORS >, <, <=,==, !=
		
		int num1=20;
		int num2=22;
		
		System.out.println(num1>num2); //false
		System.out.println(num1<num2);//true
		System.out.println(num1!=num2);//true
		
		System.out.println(num1==num2); //no=false 
		System.out.println(num1=num2); //22
		
		System.out.println(num1==num2); //true 
		
		boolean result=100>200;
		System.out.println(result);
		
		result1=100+200;
		
		String result2="Emre" + 10;	
		
		int num3=10;
		int num4=11;
		
		result=num3=num4;//if num3 ewuals to num4
		System.out.println(result); //false
		
		//type mismatch: cannot caonvert from boolean to int 
		
		
	}

}
