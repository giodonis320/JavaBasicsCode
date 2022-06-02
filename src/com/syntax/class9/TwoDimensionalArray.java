package com.syntax.class9;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to create 2D array we specify # of rows and cols=size 
		int [] [] numbers=new int [3][4];
		//1now
		numbers[0][0]=10;
		numbers[0][0]=20;
		numbers[0][0]=30;
		numbers[0][0]=40;
		//2 row 
		numbers[0][0]=1;
		numbers[0][0]=2;
		numbers[0][0]=3;
		numbers[0][0]=4;
		//3 row 
		numbers[0][0]=9;
		numbers[0][0]=8;
		numbers[0][0]=7;
		numbers[0][0]=6;
		
		System.out.println(numbers [1][3]);//4
		System.out.println(numbers [0] [1]);//20
		
		int rows=numbers.length;//gives you numbers of rows 
		System.out.println("Number of rows = "+rows);
		
		int colsOf1row=numbers[0].length;
		System.out.println("Numbers of cols in 1 row ="+colsOf1row );
		
		
		
	}

}
