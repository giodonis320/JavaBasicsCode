package com.syntax.class5;

public class LogivalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean boo=true;
		
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		/* 
		 * if there is no traffic ---> I will be at work on time 
		 */

		boolean traffic= false; 
		
		if (!traffic) {
			System.out.println(" I will reach work on time");
			
		}
		
		String name= "Reza";
		
		if (!name.equals("Emre")) {
			System.out.println(" you are not Emre, and I need Emre ");
		}
	}

}
