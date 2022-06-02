package com.syntax.class9;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//I want to store prices in array
		
		double[] price=new double[4];
		price [1]=1.99;
		price [2]=2.99;
		price [3]=3.99;
		System.out.println(price[0]);
		
		int[] numbers=new int [2];
		numbers [0]=10;
		numbers [1]=11;
		numbers [2]=12;
		
		//numbers [3]=13; during run time error  --> arrayindex out of bound 
		
		System.out.println(numbers[3]);
		
		//array are fixed in size
		//during runtime java cannot increase or decrease a size of an array 
		

	}

}
