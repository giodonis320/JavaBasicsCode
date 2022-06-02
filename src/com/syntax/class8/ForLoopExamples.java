package com.syntax.class8;

public class ForLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//i need to print numbers from 1 to 90
		
		for (int i=1; i<=90; i++) {
			System.out.println(i+"");
		}

		/*
		 * start point 
		 * end point 
		 * increment/decrement 
		 */
		
		//I need numners from 60 to 10 
		
		System.out.println("-------------------");
		
		for ( int num=20 ; num >= 1 ; num-- ) { if (num%2==0) { 
			
			System.out.print(num+ " ");}}
		
		System.out.println("-------------------");
		
		for (int a =20; a >=1; a-=2) {
			System.out.print(a + " ");
		}
		
		
	}

}
